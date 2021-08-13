package com.example.hilt.dagger2.module

import android.util.Log
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import java.util.concurrent.TimeUnit

//@Module
//class DaggerModule {
//    @Provides
//    fun provideOkHttpClient():OkHttpClient{
//        val loggingInterceptor = HttpLoggingInterceptor { message -> Log.d("okhttp", message) }
//            .setLevel( HttpLoggingInterceptor.Level.BODY)
//
//        val builder = OkHttpClient.Builder()
//            .connectTimeout(30, TimeUnit.SECONDS)
//            .readTimeout(30, TimeUnit.SECONDS)
//            .addInterceptor(loggingInterceptor)
//        return builder.build()
//    }
//}