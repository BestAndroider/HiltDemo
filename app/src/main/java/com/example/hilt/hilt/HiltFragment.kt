package com.example.hilt.hilt

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.hilt.R
import com.example.hilt.hilt.annotation.BindTiga
import com.example.hilt.hilt.annotation.BindZero
import com.example.hilt.hilt.interfaces.Ultraman
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint
class HiltFragment : Fragment() {

    @BindTiga
    //@Named("Tiga")
    @Inject
    lateinit var tigaUlraman: Ultraman

    @BindZero
    //@Named("Zero")
    @Inject
    lateinit var zeroUlraman: Ultraman

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_hilt, null, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tigaUlraman.transfiguration()
        zeroUlraman.transfiguration()
    }
}