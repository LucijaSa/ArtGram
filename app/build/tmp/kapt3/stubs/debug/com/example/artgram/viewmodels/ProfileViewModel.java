package com.example.artgram.viewmodels;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0015R\u001f\u0010\u0005\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00070\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0016"}, d2 = {"Lcom/example/artgram/viewmodels/ProfileViewModel;", "Lcom/example/artgram/common/base/BaseViewModel;", "repository", "Lcom/example/artgram/repositories/UserRepository;", "(Lcom/example/artgram/repositories/UserRepository;)V", "newNickNameIsVisible", "Landroidx/lifecycle/MutableLiveData;", "", "kotlin.jvm.PlatformType", "getNewNickNameIsVisible", "()Landroidx/lifecycle/MutableLiveData;", "user", "Landroidx/lifecycle/LiveData;", "Lcom/example/artgram/data/User;", "getUser", "()Landroidx/lifecycle/LiveData;", "logout", "", "setNewNickNameIsVisible", "updateNickname", "newNickName", "", "app_debug"})
public final class ProfileViewModel extends com.example.artgram.common.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.artgram.data.User> user = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> newNickNameIsVisible = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.artgram.data.User> getUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getNewNickNameIsVisible() {
        return null;
    }
    
    public final void setNewNickNameIsVisible() {
    }
    
    public final void updateNickname(@org.jetbrains.annotations.NotNull()
    java.lang.String newNickName) {
    }
    
    public final void logout() {
    }
    
    @javax.inject.Inject()
    public ProfileViewModel(@org.jetbrains.annotations.NotNull()
    com.example.artgram.repositories.UserRepository repository) {
        super();
    }
}