package com.example.artgram.viewmodels;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0012\u001a\u00020\u000eR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/artgram/viewmodels/ImageViewModel;", "Lcom/example/artgram/common/base/BaseViewModel;", "imagesRepository", "Lcom/example/artgram/repositories/ImagesRepository;", "(Lcom/example/artgram/repositories/ImagesRepository;)V", "images", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/artgram/data/Image;", "getImages", "()Landroidx/lifecycle/MutableLiveData;", "imagesByNickName", "getImagesByNickName", "getImagesByNickname", "", "nickName", "", "navigateToImageByNickname", "refreshImages", "app_debug"})
public final class ImageViewModel extends com.example.artgram.common.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.artgram.data.Image>> images = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.artgram.data.Image>> imagesByNickName = null;
    private final com.example.artgram.repositories.ImagesRepository imagesRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.artgram.data.Image>> getImages() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.artgram.data.Image>> getImagesByNickName() {
        return null;
    }
    
    public final void refreshImages() {
    }
    
    public final void navigateToImageByNickname(@org.jetbrains.annotations.NotNull()
    java.lang.String nickName) {
    }
    
    public final void getImagesByNickname(@org.jetbrains.annotations.NotNull()
    java.lang.String nickName) {
    }
    
    @javax.inject.Inject()
    public ImageViewModel(@org.jetbrains.annotations.NotNull()
    com.example.artgram.repositories.ImagesRepository imagesRepository) {
        super();
    }
}