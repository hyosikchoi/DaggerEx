package com.hyosik.android.daggerex.data.entity

import com.hyosik.android.daggerex.component.MachineComponent
import com.hyosik.android.daggerex.module.MachineModule

class Machine(builder: MachineComponent.Builder) {

    private var component : MachineComponent

    init {
        component = builder.setMachineModule(MachineModule()).build()
        component.inject(this)
    }

    fun extract() : Coffee {
        return component.getCoffee()
    }

}