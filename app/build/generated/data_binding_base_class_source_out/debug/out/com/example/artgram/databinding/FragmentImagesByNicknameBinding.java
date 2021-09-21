// Generated by data binding compiler. Do not edit!
package com.example.artgram.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.example.artgram.R;
import com.example.artgram.viewmodels.ImageViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentImagesByNicknameBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView rvImages;

  @NonNull
  public final AppCompatTextView tvImagesByText;

  @NonNull
  public final AppCompatTextView tvImagesByTitle;

  @Bindable
  protected ImageViewModel mViewModel;

  protected FragmentImagesByNicknameBinding(Object _bindingComponent, View _root,
      int _localFieldCount, RecyclerView rvImages, AppCompatTextView tvImagesByText,
      AppCompatTextView tvImagesByTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.rvImages = rvImages;
    this.tvImagesByText = tvImagesByText;
    this.tvImagesByTitle = tvImagesByTitle;
  }

  public abstract void setViewModel(@Nullable ImageViewModel viewModel);

  @Nullable
  public ImageViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentImagesByNicknameBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_images_by_nickname, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentImagesByNicknameBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentImagesByNicknameBinding>inflateInternal(inflater, R.layout.fragment_images_by_nickname, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentImagesByNicknameBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_images_by_nickname, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentImagesByNicknameBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentImagesByNicknameBinding>inflateInternal(inflater, R.layout.fragment_images_by_nickname, null, false, component);
  }

  public static FragmentImagesByNicknameBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentImagesByNicknameBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (FragmentImagesByNicknameBinding)bind(component, view, R.layout.fragment_images_by_nickname);
  }
}
