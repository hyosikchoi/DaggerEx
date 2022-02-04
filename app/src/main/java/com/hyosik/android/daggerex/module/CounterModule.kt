package com.hyosik.android.daggerex.module

import dagger.Module
import dagger.Provides

@Module
class CounterModule {
    var next : Int = 100

    @Provides
    fun provideInteger() : Int {
        println("computing...")
        return next++
    }

}