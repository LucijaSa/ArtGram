package com.example.artgram.common.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u0004J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0005H\u0004J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000bH\u0004J2\u0010\u0012\u001a\u00020\t\"\u0004\b\u0000\u0010\u00132\u001c\u0010\u0014\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00130\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0015\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"Lcom/example/artgram/common/base/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "uiEventLiveData", "Lcom/example/artgram/common/events/EventLiveData;", "Lcom/example/artgram/common/events/UIEvent;", "getUiEventLiveData", "()Lcom/example/artgram/common/events/EventLiveData;", "navigate", "", "action", "", "bundle", "Landroid/os/Bundle;", "notifyEvent", "uiEvent", "setMessage", "messageId", "suspendCall", "T", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;)V", "app_debug"})
public abstract class BaseViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.artgram.common.events.EventLiveData<com.example.artgram.common.events.UIEvent> uiEventLiveData = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.artgram.common.events.EventLiveData<com.example.artgram.common.events.UIEvent> getUiEventLiveData() {
        return null;
    }
    
    public final <T extends java.lang.Object>void suspendCall(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> block) {
    }
    
    protected final void notifyEvent(@org.jetbrains.annotations.NotNull()
    com.example.artgram.common.events.UIEvent uiEvent) {
    }
    
    protected final void navigate(@androidx.annotation.IdRes()
    int action, @org.jetbrains.annotations.Nullable()
    android.os.Bundle bundle) {
    }
    
    protected final void setMessage(int messageId) {
    }
    
    public BaseViewModel() {
        super();
    }
}