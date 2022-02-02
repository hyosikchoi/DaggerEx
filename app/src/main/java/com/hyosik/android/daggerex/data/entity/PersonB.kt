package com.hyosik.android.daggerex.data.entity

import androidx.annotation.Nullable
import javax.inject.Inject

class PersonB {

    @Inject
    @Nullable
    lateinit var name : String // 필드 주입

    var age : Int ?= null
       @Inject set(value) {
           field = value
       }  // 메서드 주입


}