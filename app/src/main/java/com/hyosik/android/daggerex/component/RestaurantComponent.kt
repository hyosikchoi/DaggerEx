package com.hyosik.android.daggerex.component

import com.hyosik.android.daggerex.data.entity.Restaurant
import com.hyosik.android.daggerex.module.RestaurantModule
import dagger.Component

@Component(modules = [RestaurantModule::class])
interface RestaurantComponent {

    fun inject(restaurant: Restaurant)

}