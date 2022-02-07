package com.hyosik.android.daggerex.data.entity

import javax.inject.Inject

class Poo {

    @Inject
    lateinit var str : String

    var num : Int ?= null
        @Inject set(value) {
            field = value
        }

}