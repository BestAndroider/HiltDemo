package com.example.hilt.hilt.interfaceImp

import android.util.Log
import com.example.hilt.hilt.interfaces.Engine
import javax.inject.Inject

class ElectricEngine @Inject constructor(): Engine {
    override fun start() {
        Log.e("Engine","ElectricEngine started...")
    }
}