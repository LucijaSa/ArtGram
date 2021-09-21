package com.example.artgram.common.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0004B;\u0012$\u0010\u0005\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0000`\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u00a2\u0006\u0002\u0010\fJ\u0015\u0010\u0010\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00020\u0012H$\u00a2\u0006\u0002\u0010\u0013J\u001d\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00028\u00012\u0006\u0010\u0016\u001a\u00020\u0007H\u0016\u00a2\u0006\u0002\u0010\u0017J\u001d\u0010\u0018\u001a\u00028\u00012\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0007H\u0016\u00a2\u0006\u0002\u0010\u001cR\u0012\u0010\r\u001a\u00020\u0007X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR,\u0010\u0005\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0000`\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/example/artgram/common/base/BaseAdapter;", "M", "VH", "Lcom/example/artgram/common/base/AbstractViewHolder;", "Landroidx/recyclerview/widget/ListAdapter;", "listener", "Lkotlin/Function2;", "", "", "Lcom/example/artgram/common/base/ItemClickListener;", "diffCallback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "(Lkotlin/jvm/functions/Function2;Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V", "itemLayout", "getItemLayout", "()I", "createViewHolder", "view", "Landroid/view/View;", "(Landroid/view/View;)Lcom/example/artgram/common/base/AbstractViewHolder;", "onBindViewHolder", "holder", "position", "(Lcom/example/artgram/common/base/AbstractViewHolder;I)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "(Landroid/view/ViewGroup;I)Lcom/example/artgram/common/base/AbstractViewHolder;", "app_debug"})
public abstract class BaseAdapter<M extends java.lang.Object, VH extends com.example.artgram.common.base.AbstractViewHolder<M>> extends androidx.recyclerview.widget.ListAdapter<M, VH> {
    private final kotlin.jvm.functions.Function2<M, java.lang.Integer, kotlin.Unit> listener = null;
    
    protected abstract int getItemLayout();
    
    @org.jetbrains.annotations.NotNull()
    protected abstract VH createViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.View view);
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public VH onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    VH holder, int position) {
    }
    
    public BaseAdapter(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function2<? super M, ? super java.lang.Integer, kotlin.Unit> listener, @org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.DiffUtil.ItemCallback<M> diffCallback) {
        super(null);
    }
}