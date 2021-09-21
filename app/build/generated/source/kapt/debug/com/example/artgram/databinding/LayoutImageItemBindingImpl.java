package com.example.artgram.databinding;
import com.example.artgram.R;
import com.example.artgram.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class LayoutImageItemBindingImpl extends LayoutImageItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public LayoutImageItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private LayoutImageItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatImageView) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[1]
            );
        this.ivImage.setTag(null);
        this.llImageLayout.setTag(null);
        this.tvNickname.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.image == variableId) {
            setImage((com.example.artgram.data.Image) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setImage(@Nullable com.example.artgram.data.Image Image) {
        this.mImage = Image;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.image);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        java.lang.String imageNickName = null;
        com.example.artgram.data.Image image = mImage;
        java.lang.String imageImageUri = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (image != null) {
                    // read image.nickName
                    imageNickName = image.getNickName();
                    // read image.imageUri
                    imageImageUri = image.getImageUri();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.example.artgram.util.BindingAdapters.setImageFromUrl(this.ivImage, imageImageUri);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvNickname, imageNickName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): image
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}