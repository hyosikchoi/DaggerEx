package com.hyosik.android.daggerex.module

import com.hyosik.android.daggerex.component.MachineComponent
import com.hyosik.android.daggerex.data.entity.Machine
import com.hyosik.android.daggerex.data.entity.Water
import dagger.Module
import dagger.Provides

@Module(subcomponents = [MachineComponent::class])
class CafeModule {

    @Provides
    fun provideWater() : Water {
        return Water()
    }

    @Provides
    fun provideMachine(builder : MachineComponent.Builder) : Machine {
        return Machine(builder = builder)
    }

}