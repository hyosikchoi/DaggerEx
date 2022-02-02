package com.hyosik.android.daggerex.data.entity

import androidx.annotation.Nullable
import javax.inject.Inject

class MyClass {
    var str : String ?= ""
       @Inject set(value : String?) {
           field = value
       }
}


