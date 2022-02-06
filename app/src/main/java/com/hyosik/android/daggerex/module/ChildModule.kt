package com.hyosik.android.daggerex.module

import dagger.Module
import dagger.Provides
import dagger.multibindings.IntoSet

@Module
class ChildModule {

    @Provides
    @IntoSet
    fun string3() : String {
        return "child string1"
    }

    @Provides
    @IntoSet
    fun string4() : String {
        return "child string2"
    }

}