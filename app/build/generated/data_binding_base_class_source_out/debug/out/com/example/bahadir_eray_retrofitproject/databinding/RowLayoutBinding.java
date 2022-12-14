// Generated by view binder compiler. Do not edit!
package com.example.bahadir_eray_retrofitproject.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.bahadir_eray_retrofitproject.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RowLayoutBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView marsId;

  @NonNull
  public final CircleImageView marsImageView;

  @NonNull
  public final TextView marsPrice;

  @NonNull
  public final TextView marsType;

  @NonNull
  public final ConstraintLayout rowMars;

  private RowLayoutBinding(@NonNull ConstraintLayout rootView, @NonNull TextView marsId,
      @NonNull CircleImageView marsImageView, @NonNull TextView marsPrice,
      @NonNull TextView marsType, @NonNull ConstraintLayout rowMars) {
    this.rootView = rootView;
    this.marsId = marsId;
    this.marsImageView = marsImageView;
    this.marsPrice = marsPrice;
    this.marsType = marsType;
    this.rowMars = rowMars;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RowLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RowLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.row_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RowLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.marsId;
      TextView marsId = ViewBindings.findChildViewById(rootView, id);
      if (marsId == null) {
        break missingId;
      }

      id = R.id.marsImageView;
      CircleImageView marsImageView = ViewBindings.findChildViewById(rootView, id);
      if (marsImageView == null) {
        break missingId;
      }

      id = R.id.marsPrice;
      TextView marsPrice = ViewBindings.findChildViewById(rootView, id);
      if (marsPrice == null) {
        break missingId;
      }

      id = R.id.marsType;
      TextView marsType = ViewBindings.findChildViewById(rootView, id);
      if (marsType == null) {
        break missingId;
      }

      ConstraintLayout rowMars = (ConstraintLayout) rootView;

      return new RowLayoutBinding((ConstraintLayout) rootView, marsId, marsImageView, marsPrice,
          marsType, rowMars);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
