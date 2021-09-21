package com.example.artgram.ui.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B#\u0012\u001c\b\u0002\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0014J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0006H\u0016R\u0014\u0010\t\u001a\u00020\u0006X\u0094D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0012"}, d2 = {"Lcom/example/artgram/ui/adapters/ImagesRecyclerAdapter;", "Lcom/example/artgram/common/base/BaseAdapter;", "Lcom/example/artgram/data/Image;", "Lcom/example/artgram/ui/adapters/ImagesViewHolder;", "itemClickListener", "Lkotlin/Function2;", "", "", "(Lkotlin/jvm/functions/Function2;)V", "itemLayout", "getItemLayout", "()I", "createViewHolder", "view", "Landroid/view/View;", "getItemId", "", "position", "app_debug"})
public final class ImagesRecyclerAdapter extends com.example.artgram.common.base.BaseAdapter<com.example.artgram.data.Image, com.example.artgram.ui.adapters.ImagesViewHolder> {
    private final int itemLayout = com.example.artgram.R.layout.layout_image_item;
    
    @java.lang.Override()
    protected int getItemLayout() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.example.artgram.ui.adapters.ImagesViewHolder createViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    public ImagesRecyclerAdapter(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function2<? super com.example.artgram.data.Image, ? super java.lang.Integer, kotlin.Unit> itemClickListener) {
        super(null, null);
    }
    
    public ImagesRecyclerAdapter() {
        super(null, null);
    }
}