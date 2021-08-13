package com.example.hilt.hilt

import android.util.Log
import com.example.hilt.hilt.interfaces.Engine
import javax.inject.Inject

class FuelEngine @Inject constructor() : Engine {
    override fun start() {
        Log.e("Engine", "FuelEngine started...")
    }
}