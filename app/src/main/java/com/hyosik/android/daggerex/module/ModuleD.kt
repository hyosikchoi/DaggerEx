package com.hyosik.android.daggerex.module

import dagger.Module
import dagger.Provides

@Module
class ModuleD {

    @Provides
    fun getInt() : Int  {
        return 100
    }

}