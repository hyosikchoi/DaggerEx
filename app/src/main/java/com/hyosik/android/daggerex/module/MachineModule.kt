package com.hyosik.android.daggerex.module

import com.hyosik.android.daggerex.data.entity.CoffeeBean
import dagger.Module
import dagger.Provides

@Module
class MachineModule {

    @Provides
    fun provideCoffeeBean() : CoffeeBean {
        return CoffeeBean()
    }

}