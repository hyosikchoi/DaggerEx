package com.hyosik.android.daggerex.component

import com.hyosik.android.daggerex.MainFragment
import com.hyosik.android.daggerex.data.qualifier.FragmentScope
import com.hyosik.android.daggerex.module.MainFragmentModule
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent


@Subcomponent(modules = [MainFragmentModule::class])
@FragmentScope
interface MainFragmentComponent {

    fun inject(mainFragment: MainFragment)

    @Subcomponent.Builder
    interface Builder {

        fun setFragmentModule(mainFragmentModule: MainFragmentModule) : Builder

        @BindsInstance
        fun setFragment(mainFragment: MainFragment) : Builder

        fun build() : MainFragmentComponent

    }

}