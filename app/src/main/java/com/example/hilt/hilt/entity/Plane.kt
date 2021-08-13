package com.example.hilt.hilt.entity

import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Plane @Inject constructor(@ApplicationContext val context: Context)