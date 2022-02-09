package com.hyosik.android.daggerex.component

import com.hyosik.android.daggerex.data.entity.Cook
import com.hyosik.android.daggerex.data.entity.PastaSet
import com.hyosik.android.daggerex.module.CookModule
import dagger.Subcomponent

@Subcomponent(modules = [CookModule::class])
interface CookComponent {
    // CookModule 로부터 Pasta 를 그리고 RestaurantModule 로부터 Coke 를 받아서
    // PastaSet 에 프로비전 메서드로 주입을 시킨다.
    fun getPastaSet() : PastaSet

    fun inject(cook: Cook)

    @Subcomponent.Builder
    interface Builder {

        fun setCookModule(cookModule: CookModule) : Builder

        fun build() : CookComponent

    }

}