package com.hyosik.android.daggerex.data.entity

import com.hyosik.android.daggerex.component.DaggerRestaurantComponent
import javax.inject.Inject

class Restaurant {

    @Inject
    lateinit var cook : Cook

    init {
        // RestaurantComponent 에 멤버 인젝션으로 cook 를 모듈로부터 주입 받는다.
        DaggerRestaurantComponent.create().inject(this)
    }

    fun orderPastaSet() : PastaSet {
        return cook.cookPastaSet()
    }

}