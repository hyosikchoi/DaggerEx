package com.hyosik.android.daggerex.module

import com.hyosik.android.daggerex.data.entity.A
import dagger.Module
import dagger.Provides

@Module
class ModuleA {

    @Provides
    fun provideA() : A = A()

}