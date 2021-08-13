package com.example.hilt.hilt.interfaceImp

import android.util.Log
import com.example.hilt.hilt.interfaces.Ultraman
import javax.inject.Inject

class ZeroUlraman @Inject constructor() : Ultraman {
    override fun transfiguration() {
        Log.e("Ultraman", "Zero!!!")
    }
}