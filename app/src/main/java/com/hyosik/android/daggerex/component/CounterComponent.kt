package com.hyosik.android.daggerex.component

import com.hyosik.android.daggerex.data.entity.Counter
import com.hyosik.android.daggerex.module.CounterModule
import dagger.Component

@Component(modules = [CounterModule::class])
interface CounterComponent {

    fun inject(counter: Counter)

}