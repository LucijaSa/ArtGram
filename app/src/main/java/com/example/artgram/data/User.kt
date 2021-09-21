package com.example.artgram.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(
    var email: String = "",
    var nickName: String = ""
) : Parcelable