package com.example.hilt.hilt.module

import com.example.hilt.hilt.annotation.BindTiga
import com.example.hilt.hilt.annotation.BindZero
import com.example.hilt.hilt.interfaceImp.TigaUlraman
import com.example.hilt.hilt.interfaceImp.ZeroUlraman
import com.example.hilt.hilt.interfaces.Ultraman
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Named

@Module
@InstallIn(ActivityComponent::class)
abstract class UlramanModule {
    @Binds
    @BindTiga
    //@Named("Tiga")
    abstract fun bindTiga(tigaUlraman: TigaUlraman): Ultraman

    @Binds
    @BindZero
    //@Named("Zero")
    abstract fun bindZero(zeroUlraman: ZeroUlraman): Ultraman
}