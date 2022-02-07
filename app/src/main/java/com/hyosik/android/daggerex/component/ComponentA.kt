package com.hyosik.android.daggerex.component


import com.hyosik.android.daggerex.module.ModuleC
import dagger.Component

@Component(modules = [ModuleC::class])
interface ComponentA {

    fun getString() : String

}