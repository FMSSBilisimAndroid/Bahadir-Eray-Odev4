package com.example.bahadir_eray_retrofitproject.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bahadir_eray_retrofitproject.adapter.RecyclerViewAdapter
import com.example.bahadir_eray_retrofitproject.databinding.FragmentMenuBinding
import com.example.bahadir_eray_retrofitproject.model.MarsModel
import com.example.bahadir_eray_retrofitproject.service.MarsAPIService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MenuFragment : Fragment() {

    private var _binding: FragmentMenuBinding? = null
    private val binding get() = _binding!!
    private val marsAPIService = MarsAPIService()
    private var marsModel: ArrayList<MarsModel>? = null
    private var recyclerViewAdapter: RecyclerViewAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMenuBinding.inflate(layoutInflater, container, false)
        val view = binding.root
        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getDataFromAPI()
        val layoutManager: RecyclerView.LayoutManager = GridLayoutManager(
            requireContext().applicationContext,
            2,
            GridLayoutManager.VERTICAL,
            false
        )
        binding.recyclerView.layoutManager = layoutManager

    }

    private fun getDataFromAPI() {
        val call = marsAPIService.getMars()
        call.enqueue(object : Callback<List<MarsModel>> {
            override fun onResponse(
                call: Call<List<MarsModel>>,
                response: Response<List<MarsModel>>
            ) {
                if (response.isSuccessful) {
                    response.body()?.let {
                        marsModel = ArrayList(it)
                        marsModel?.let {
                            recyclerViewAdapter = RecyclerViewAdapter(marsModel!!)
                            binding.recyclerView.adapter = recyclerViewAdapter
                        }
                    }
                }
            }

            override fun onFailure(call: Call<List<MarsModel>>, t: Throwable) {
                t.printStackTrace()
            }

        })
    }

}