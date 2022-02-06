package com.hyosik.android.daggerex.component

import com.hyosik.android.daggerex.module.ChildModule
import dagger.Subcomponent


@Subcomponent(modules = [ChildModule::class])
interface ChildComponent {

    fun strings() : Set<String>

    @Subcomponent.Builder
    interface Builder {
        fun build() : ChildComponent
    }

}