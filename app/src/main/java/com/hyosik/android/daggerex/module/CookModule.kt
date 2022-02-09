package com.hyosik.android.daggerex.module

import com.hyosik.android.daggerex.data.entity.Pasta
import dagger.Module
import dagger.Provides


@Module
class CookModule {

    @Provides
    fun providePasta() : Pasta {
        return Pasta()
    }

}