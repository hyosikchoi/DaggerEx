package com.hyosik.android.daggerex.component

import com.hyosik.android.daggerex.module.ParentModule
import dagger.Component

@Component(modules = [ParentModule::class])
interface ParentComponent {

    fun strings() : Set<String>

    fun childCompBuilder() : ChildComponent.Builder

}