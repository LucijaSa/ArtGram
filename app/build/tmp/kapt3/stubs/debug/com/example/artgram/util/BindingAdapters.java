package com.example.artgram.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u0002H\u0005\u0018\u00010\tH\u0007J\u001a\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007\u00a8\u0006\u000f"}, d2 = {"Lcom/example/artgram/util/BindingAdapters;", "", "()V", "setData", "", "T", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "data", "", "setImageFromUrl", "imageView", "Landroid/widget/ImageView;", "path", "", "app_debug"})
public final class BindingAdapters {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.artgram.util.BindingAdapters INSTANCE = null;
    
    @androidx.databinding.BindingAdapter(value = {"imageFromURL"})
    public static final void setImageFromUrl(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, @org.jetbrains.annotations.Nullable()
    java.lang.String path) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"items"})
    public static final <T extends java.lang.Object>void setData(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends T> data) {
    }
    
    private BindingAdapters() {
        super();
    }
}