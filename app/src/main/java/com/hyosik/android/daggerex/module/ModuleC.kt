package com.hyosik.android.daggerex.module

import dagger.Module
import dagger.Provides

@Module
class ModuleC {

    @Provides
    fun provideString() : String {
        return "String from ModuleC"
    }

}