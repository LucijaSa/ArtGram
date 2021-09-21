package com.example.artgram.databinding;
import com.example.artgram.R;
import com.example.artgram.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentProfileBindingImpl extends FragmentProfileBinding implements com.example.artgram.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tvProfileTitle, 6);
        sViewsWithIds.put(R.id.tvEmailTitle, 7);
        sViewsWithIds.put(R.id.llName, 8);
        sViewsWithIds.put(R.id.tvNameTitle, 9);
        sViewsWithIds.put(R.id.etNewNickName, 10);
        sViewsWithIds.put(R.id.btnSaveNewNickName, 11);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentProfileBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private FragmentProfileBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.appcompat.widget.AppCompatButton) bindings[4]
            , (androidx.appcompat.widget.AppCompatButton) bindings[3]
            , (androidx.appcompat.widget.AppCompatButton) bindings[11]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[1]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[10]
            , (android.widget.LinearLayout) bindings[5]
            , (android.widget.LinearLayout) bindings[8]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[7]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[9]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[6]
            );
        this.btnChangeName.setTag(null);
        this.btnLogout.setTag(null);
        this.etEmail.setTag(null);
        this.llChangeName.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvName.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.example.artgram.generated.callback.OnClickListener(this, 2);
        mCallback1 = new com.example.artgram.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.example.artgram.viewmodels.ProfileViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.example.artgram.viewmodels.ProfileViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelNewNickNameIsVisible((androidx.lifecycle.MutableLiveData<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelUser((androidx.lifecycle.LiveData<com.example.artgram.data.User>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelNewNickNameIsVisible(androidx.lifecycle.MutableLiveData<java.lang.Boolean> ViewModelNewNickNameIsVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelUser(androidx.lifecycle.LiveData<com.example.artgram.data.User> ViewModelUser, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String viewModelUserEmail = null;
        com.example.artgram.data.User viewModelUserGetValue = null;
        androidx.lifecycle.MutableLiveData<java.lang.Boolean> viewModelNewNickNameIsVisible = null;
        androidx.lifecycle.LiveData<com.example.artgram.data.User> viewModelUser = null;
        java.lang.String viewModelUserNickName = null;
        java.lang.Boolean viewModelNewNickNameIsVisibleGetValue = null;
        boolean viewModelNewNickNameIsVisibleBooleanFalse = false;
        int viewModelNewNickNameIsVisibleBooleanFalseViewGONEViewVISIBLE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelNewNickNameIsVisibleGetValue = false;
        com.example.artgram.viewmodels.ProfileViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.newNickNameIsVisible
                        viewModelNewNickNameIsVisible = viewModel.getNewNickNameIsVisible();
                    }
                    updateLiveDataRegistration(0, viewModelNewNickNameIsVisible);


                    if (viewModelNewNickNameIsVisible != null) {
                        // read viewModel.newNickNameIsVisible.getValue()
                        viewModelNewNickNameIsVisibleGetValue = viewModelNewNickNameIsVisible.getValue();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.newNickNameIsVisible.getValue())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelNewNickNameIsVisibleGetValue = androidx.databinding.ViewDataBinding.safeUnbox(viewModelNewNickNameIsVisibleGetValue);


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.newNickNameIsVisible.getValue()) == false
                    viewModelNewNickNameIsVisibleBooleanFalse = (androidxDatabindingViewDataBindingSafeUnboxViewModelNewNickNameIsVisibleGetValue) == (false);
                if((dirtyFlags & 0xdL) != 0) {
                    if(viewModelNewNickNameIsVisibleBooleanFalse) {
                            dirtyFlags |= 0x20L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.newNickNameIsVisible.getValue()) == false ? View.GONE : View.VISIBLE
                    viewModelNewNickNameIsVisibleBooleanFalseViewGONEViewVISIBLE = ((viewModelNewNickNameIsVisibleBooleanFalse) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.user
                        viewModelUser = viewModel.getUser();
                    }
                    updateLiveDataRegistration(1, viewModelUser);


                    if (viewModelUser != null) {
                        // read viewModel.user.getValue()
                        viewModelUserGetValue = viewModelUser.getValue();
                    }


                    if (viewModelUserGetValue != null) {
                        // read viewModel.user.getValue().email
                        viewModelUserEmail = viewModelUserGetValue.getEmail();
                        // read viewModel.user.getValue().nickName
                        viewModelUserNickName = viewModelUserGetValue.getNickName();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.btnChangeName.setOnClickListener(mCallback2);
            this.btnLogout.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etEmail, viewModelUserEmail);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvName, viewModelUserNickName);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.llChangeName.setVisibility(viewModelNewNickNameIsVisibleBooleanFalseViewGONEViewVISIBLE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.example.artgram.viewmodels.ProfileViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.setNewNickNameIsVisible();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                com.example.artgram.viewmodels.ProfileViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.logout();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.newNickNameIsVisible
        flag 1 (0x2L): viewModel.user
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.newNickNameIsVisible.getValue()) == false ? View.GONE : View.VISIBLE
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.newNickNameIsVisible.getValue()) == false ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}