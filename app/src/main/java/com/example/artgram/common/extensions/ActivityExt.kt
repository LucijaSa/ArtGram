package com.example.artgram.common.extensions

import android.app.Activity
import android.content.pm.PackageManager
import androidx.core.content.ContextCompat


fun Activity.hasPermissions(permissions: Array<String>): Boolean {
    if (permissions.isNotEmpty()) {
        for (permission in permissions) {
            if (ContextCompat.checkSelfPermission(
                    this,
                    permission
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                return false
            }
        }
    }
    return true
}