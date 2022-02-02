package com.hyosik.android.daggerex.module

import dagger.Module
import dagger.Provides

@Module
class MyModule {

    @Provides
    fun provideHelloWorld() : String {
        return "Hello World"
    }

}