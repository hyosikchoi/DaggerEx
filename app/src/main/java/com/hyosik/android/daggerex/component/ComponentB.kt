package com.hyosik.android.daggerex.component



import com.hyosik.android.daggerex.data.entity.Poo
import com.hyosik.android.daggerex.module.ModuleD
import dagger.Component

@Component(
    modules = [ModuleD::class],
    dependencies = [ComponentA::class]

)
interface ComponentB {

    fun inject(poo: Poo)

}