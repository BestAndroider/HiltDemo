package com.example.hilt.dagger2

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.hilt.R
//import com.example.hilt.dagger2.component.DaggerDagger2Component
import okhttp3.OkHttpClient
import javax.inject.Inject

class DaggerActivity : AppCompatActivity() {
//    private val TAG = "DaggerActivity"
//
//    @Inject
//    lateinit var person: Person
//
//    @Inject
//    lateinit var okHttpClient: OkHttpClient

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dagger)
//        DaggerDagger2Component.create().inject(this)
//        Log.e(TAG, person.toString())
//        Log.e(TAG,okHttpClient.toString())
    }
}