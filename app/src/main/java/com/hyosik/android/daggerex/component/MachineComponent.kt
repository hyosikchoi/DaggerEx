package com.hyosik.android.daggerex.component

import com.hyosik.android.daggerex.data.entity.Coffee
import com.hyosik.android.daggerex.data.entity.Machine
import com.hyosik.android.daggerex.module.MachineModule
import dagger.Subcomponent

@Subcomponent(modules = [MachineModule::class])
interface MachineComponent {

    fun getCoffee() : Coffee

    fun inject(machine : Machine)

    @Subcomponent.Builder
    interface Builder {

        fun setMachineModule(coffeeMachineModule: MachineModule) : Builder

        fun build() : MachineComponent
    }

}