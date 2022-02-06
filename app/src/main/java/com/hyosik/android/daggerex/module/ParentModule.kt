package com.hyosik.android.daggerex.module

import com.hyosik.android.daggerex.component.ChildComponent
import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoSet

@Module(subcomponents = [ChildComponent::class])
class ParentModule {

    @Provides
    @IntoSet
    fun string1() : String {
        return "parent string1"
    }

    @Provides
    @IntoSet
    fun string2() : String {
        return "parent string2"
    }

}