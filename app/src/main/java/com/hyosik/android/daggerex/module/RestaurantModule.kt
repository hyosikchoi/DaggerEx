package com.hyosik.android.daggerex.module

import com.hyosik.android.daggerex.component.CookComponent
import com.hyosik.android.daggerex.data.entity.Coke
import com.hyosik.android.daggerex.data.entity.Cook
import dagger.Module
import dagger.Provides

@Module(subcomponents = [CookComponent::class])
class RestaurantModule {

    @Provides
    fun provideCoke() : Coke {
        return Coke()
    }
    // SubComponent 로부터 Builder는 제공받을 수 있다.
    // 다만 다른 의존성은 제공 받을 수 없다.
    @Provides
    fun provideCook(builder : CookComponent.Builder) : Cook {
        return Cook(builder = builder)
    }

}