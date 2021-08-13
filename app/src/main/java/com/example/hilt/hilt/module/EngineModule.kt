package com.example.hilt.hilt.module

import com.example.hilt.hilt.interfaceImp.ElectricEngine
import com.example.hilt.hilt.interfaces.Engine
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)

abstract class EngineModule {
    @Binds
    abstract fun bindElecEngine(electricEngine: ElectricEngine): Engine

}