package com.example.hilt.hilt

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.hilt.R
import com.example.hilt.hilt.entity.Plane
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class HiltFragment3:Fragment() {

    @Inject lateinit var plane1: Plane

    @Inject lateinit var plane2: Plane

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_hilt, null, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.e(TAG,plane1.toString())
        Log.e(TAG,plane2.toString())
    }

    companion object {
        const val TAG = "HiltFragment3"
    }

}