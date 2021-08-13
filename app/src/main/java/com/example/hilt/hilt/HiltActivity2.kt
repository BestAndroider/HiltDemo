package com.example.hilt.hilt

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.hilt.R
import com.example.hilt.hilt.entity.Plane
import com.example.hilt.hilt.entity.Train
import com.example.hilt.hilt.interfaces.Engine
import dagger.hilt.android.AndroidEntryPoint
import okhttp3.OkHttpClient
import javax.inject.Inject

@AndroidEntryPoint
class HiltActivity2 : AppCompatActivity() {
    private val TAG = "HiltActivity2"

    @Inject lateinit var okHttpClient: OkHttpClient
    @Inject lateinit var plane: Plane

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hilt)
        Log.e(TAG,okHttpClient.toString())
        Log.e(TAG,plane.context.toString())
    }
}