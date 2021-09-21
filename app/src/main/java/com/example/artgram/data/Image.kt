package com.example.artgram.data

data class Image(
    var nickName: String = "",
    var imageUri: String = "",
    var addedAt: Long = 0L      // unix timestamp
)