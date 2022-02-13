package com.hyosik.android.daggerex.component

import com.hyosik.android.daggerex.MainFragment
import com.hyosik.android.daggerex.data.qualifier.FragmentScope
import com.hyosik.android.daggerex.module.MainFragmentModule
import dagger.Subcomponent
import dagger.android.AndroidInjector


@Subcomponent(modules = [MainFragmentModule::class])
@FragmentScope
interface MainFragmentComponent : AndroidInjector<MainFragment> {

    @Subcomponent.Factory
    interface Factory : AndroidInjector.Factory<MainFragment> {}

}