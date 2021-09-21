package com.example.artgram.common.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007H\u0016J\b\u0010\u000e\u001a\u00020\fH\u0015J\u0012\u0010\u000f\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0017R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00028\u0000X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0012"}, d2 = {"Lcom/example/artgram/common/base/BaseFragment;", "V", "Lcom/example/artgram/common/base/BaseViewModel;", "Landroidx/fragment/app/Fragment;", "()V", "eventObserver", "Lcom/example/artgram/common/events/EventObserver;", "Lcom/example/artgram/common/events/UIEvent;", "viewModel", "getViewModel", "()Lcom/example/artgram/common/base/BaseViewModel;", "handleEvent", "", "uiEvent", "observe", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public abstract class BaseFragment<V extends com.example.artgram.common.base.BaseViewModel> extends androidx.fragment.app.Fragment {
    private final com.example.artgram.common.events.EventObserver<com.example.artgram.common.events.UIEvent> eventObserver = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public abstract V getViewModel();
    
    @androidx.annotation.CallSuper()
    protected void observe() {
    }
    
    public void handleEvent(@org.jetbrains.annotations.NotNull()
    com.example.artgram.common.events.UIEvent uiEvent) {
    }
    
    @androidx.annotation.CallSuper()
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public BaseFragment() {
        super();
    }
}