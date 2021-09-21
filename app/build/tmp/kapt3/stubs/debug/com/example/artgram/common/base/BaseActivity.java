package com.example.artgram.common.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0013\u001a\u00020\u0014H&J\u001c\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0018H\u0016J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u0018H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u0010\u001a\u00028\u0000X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001e"}, d2 = {"Lcom/example/artgram/common/base/BaseActivity;", "V", "Lcom/example/artgram/common/base/BaseViewModel;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "navController", "Landroidx/navigation/NavController;", "getNavController", "()Landroidx/navigation/NavController;", "navController$delegate", "Lkotlin/Lazy;", "navHostFragment", "Landroidx/navigation/fragment/NavHostFragment;", "getNavHostFragment", "()Landroidx/navigation/fragment/NavHostFragment;", "navHostFragment$delegate", "viewModel", "getViewModel", "()Lcom/example/artgram/common/base/BaseViewModel;", "getNavHost", "Landroidx/fragment/app/Fragment;", "navigate", "", "actionId", "", "bundle", "Landroid/os/Bundle;", "popDestination", "destinationId", "popToDestination", "app_debug"})
public abstract class BaseActivity<V extends com.example.artgram.common.base.BaseViewModel> extends androidx.appcompat.app.AppCompatActivity {
    private final kotlin.Lazy navHostFragment$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy navController$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    protected abstract V getViewModel();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.fragment.app.Fragment getNavHost();
    
    private final androidx.navigation.fragment.NavHostFragment getNavHostFragment() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final androidx.navigation.NavController getNavController() {
        return null;
    }
    
    public void navigate(int actionId, @org.jetbrains.annotations.Nullable()
    android.os.Bundle bundle) {
    }
    
    public void popDestination(int destinationId) {
    }
    
    public void popToDestination(int destinationId) {
    }
    
    public BaseActivity() {
        super();
    }
}