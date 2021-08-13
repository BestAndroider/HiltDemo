package com.example.hilt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hilt.dagger2.DaggerActivity
import com.example.hilt.dagger2.Person
import com.example.hilt.hilt.HiltActivity
import com.example.hilt.hilt.HiltActivity2
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"

    @Inject
    lateinit var person: Person

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initClick()
    }

    private fun initClick() {
        btn_dagger.setOnClickListener {
            startActivity(Intent(this,DaggerActivity::class.java))
        }

        btn_hilt.setOnClickListener {
            startActivity(Intent(this,HiltActivity::class.java))
        }
        btn_hilt2.setOnClickListener {
            startActivity(Intent(this, HiltActivity2::class.java))
        }
    }
}