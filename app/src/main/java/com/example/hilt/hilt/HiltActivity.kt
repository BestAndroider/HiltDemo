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
class HiltActivity : AppCompatActivity() {
    private val TAG = "HiltActivity"

    @Inject
    lateinit var plane: Plane

    @Inject
    lateinit var train: Train

    @Inject
    lateinit var engine: Engine

    @Inject lateinit var okHttpClient: OkHttpClient

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hilt)
        Log.e(TAG, plane.toString())
        Log.e(TAG, train.toString())
        engine.start()
        supportFragmentManager.beginTransaction().add(R.id.frame,HiltFragment2()).commit()

        Log.e(TAG,okHttpClient.toString())
    }
}