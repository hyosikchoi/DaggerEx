package com.hyosik.android.daggerex.component

import com.hyosik.android.daggerex.data.entity.Cafe
import com.hyosik.android.daggerex.module.CafeModule
import dagger.Component

@Component(modules = [CafeModule::class])
interface CafeComponent {

    fun inject(cafe : Cafe)

}