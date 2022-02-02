package com.hyosik.android.daggerex.module

import dagger.Module
import dagger.Provides

@Module
class PersonModule {

    @Provides
    fun provideName() : String {
        return "HyoSik"
    }

    @Provides
    fun provideAge() : Int {
        return 100
    }
}