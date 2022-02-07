package com.hyosik.android.daggerex.component

import com.hyosik.android.daggerex.module.ChildModule
import dagger.Subcomponent


@Subcomponent(modules = [ChildModule::class])
interface ChildComponent {

    fun strings() : Set<String>

    // SubComponent 를 생성하려면 반드시 Builder 혹은 Factory 를 반드시 정의해야한다.
    @Subcomponent.Builder
    interface Builder {
        fun build() : ChildComponent
    }

}