package com.example.artgram;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.artgram.databinding.ActivityMainBindingImpl;
import com.example.artgram.databinding.FragmentHomeBindingImpl;
import com.example.artgram.databinding.FragmentImagesByNicknameBindingImpl;
import com.example.artgram.databinding.FragmentLoginBindingImpl;
import com.example.artgram.databinding.FragmentProfileBindingImpl;
import com.example.artgram.databinding.FragmentRegistrationBindingImpl;
import com.example.artgram.databinding.FragmentUploadBindingImpl;
import com.example.artgram.databinding.LayoutImageItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_FRAGMENTHOME = 2;

  private static final int LAYOUT_FRAGMENTIMAGESBYNICKNAME = 3;

  private static final int LAYOUT_FRAGMENTLOGIN = 4;

  private static final int LAYOUT_FRAGMENTPROFILE = 5;

  private static final int LAYOUT_FRAGMENTREGISTRATION = 6;

  private static final int LAYOUT_FRAGMENTUPLOAD = 7;

  private static final int LAYOUT_LAYOUTIMAGEITEM = 8;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(8);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.artgram.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.artgram.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.artgram.R.layout.fragment_images_by_nickname, LAYOUT_FRAGMENTIMAGESBYNICKNAME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.artgram.R.layout.fragment_login, LAYOUT_FRAGMENTLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.artgram.R.layout.fragment_profile, LAYOUT_FRAGMENTPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.artgram.R.layout.fragment_registration, LAYOUT_FRAGMENTREGISTRATION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.artgram.R.layout.fragment_upload, LAYOUT_FRAGMENTUPLOAD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.artgram.R.layout.layout_image_item, LAYOUT_LAYOUTIMAGEITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTIMAGESBYNICKNAME: {
          if ("layout/fragment_images_by_nickname_0".equals(tag)) {
            return new FragmentImagesByNicknameBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_images_by_nickname is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLOGIN: {
          if ("layout/fragment_login_0".equals(tag)) {
            return new FragmentLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_login is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPROFILE: {
          if ("layout/fragment_profile_0".equals(tag)) {
            return new FragmentProfileBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_profile is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTREGISTRATION: {
          if ("layout/fragment_registration_0".equals(tag)) {
            return new FragmentRegistrationBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_registration is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTUPLOAD: {
          if ("layout/fragment_upload_0".equals(tag)) {
            return new FragmentUploadBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_upload is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTIMAGEITEM: {
          if ("layout/layout_image_item_0".equals(tag)) {
            return new LayoutImageItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_image_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(3);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "image");
      sKeys.put(2, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(8);

    static {
      sKeys.put("layout/activity_main_0", com.example.artgram.R.layout.activity_main);
      sKeys.put("layout/fragment_home_0", com.example.artgram.R.layout.fragment_home);
      sKeys.put("layout/fragment_images_by_nickname_0", com.example.artgram.R.layout.fragment_images_by_nickname);
      sKeys.put("layout/fragment_login_0", com.example.artgram.R.layout.fragment_login);
      sKeys.put("layout/fragment_profile_0", com.example.artgram.R.layout.fragment_profile);
      sKeys.put("layout/fragment_registration_0", com.example.artgram.R.layout.fragment_registration);
      sKeys.put("layout/fragment_upload_0", com.example.artgram.R.layout.fragment_upload);
      sKeys.put("layout/layout_image_item_0", com.example.artgram.R.layout.layout_image_item);
    }
  }
}
