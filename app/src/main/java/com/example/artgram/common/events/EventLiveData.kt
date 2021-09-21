package com.example.artgram.common.events

import androidx.lifecycle.MutableLiveData

class EventLiveData<T> : MutableLiveData<Event<T>>() {

    fun postEventValue(eventValue: T) {
        super.postValue(Event(eventValue))
    }

}
