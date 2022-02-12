package com.hyosik.android.daggerex.module

import com.hyosik.android.daggerex.data.qualifier.FragmentScope
import dagger.Module
import dagger.Provides
import java.util.*

@Module
class MainFragmentModule {

    @Provides
    @FragmentScope
    fun provideInt() : Int {
        return Random().nextInt()
    }

}