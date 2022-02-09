package com.hyosik.android.daggerex.data.entity

import com.hyosik.android.daggerex.component.CookComponent
import com.hyosik.android.daggerex.module.CookModule

class Cook(builder : CookComponent.Builder) {

    private var component : CookComponent

    init {
        component = builder.setCookModule(CookModule()).build()
        component.inject(this)
    }

    fun cookPastaSet() : PastaSet {
        return component.getPastaSet()
    }

}