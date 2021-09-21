package com.example.artgram.common.events;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/example/artgram/common/events/EventLiveData;", "T", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/artgram/common/events/Event;", "()V", "postEventValue", "", "eventValue", "(Ljava/lang/Object;)V", "app_debug"})
public final class EventLiveData<T extends java.lang.Object> extends androidx.lifecycle.MutableLiveData<com.example.artgram.common.events.Event<? extends T>> {
    
    public final void postEventValue(T eventValue) {
    }
    
    public EventLiveData() {
        super(null);
    }
}