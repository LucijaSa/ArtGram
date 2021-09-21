package com.example.artgram.viewmodels;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0002J\u000e\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0010"}, d2 = {"Lcom/example/artgram/viewmodels/UploadViewModel;", "Lcom/example/artgram/common/base/BaseViewModel;", "imagesRepository", "Lcom/example/artgram/repositories/ImagesRepository;", "(Lcom/example/artgram/repositories/ImagesRepository;)V", "pathToFileLiveData", "Landroidx/lifecycle/MutableLiveData;", "Landroid/net/Uri;", "getPathToFileLiveData", "()Landroidx/lifecycle/MutableLiveData;", "insertPhotoToFirebaseStorage", "", "uri", "uploadPhotoToFirebaseStorage", "name", "", "app_debug"})
public final class UploadViewModel extends com.example.artgram.common.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<android.net.Uri> pathToFileLiveData = null;
    private final com.example.artgram.repositories.ImagesRepository imagesRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<android.net.Uri> getPathToFileLiveData() {
        return null;
    }
    
    private final void insertPhotoToFirebaseStorage(android.net.Uri uri) {
    }
    
    public final void uploadPhotoToFirebaseStorage(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    @javax.inject.Inject()
    public UploadViewModel(@org.jetbrains.annotations.NotNull()
    com.example.artgram.repositories.ImagesRepository imagesRepository) {
        super();
    }
}