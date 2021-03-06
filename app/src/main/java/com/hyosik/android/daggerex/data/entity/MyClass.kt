package com.hyosik.android.daggerex.data.entity

import androidx.annotation.Nullable
import com.hyosik.android.daggerex.data.qualifier.GoodBye
import javax.inject.Inject
import javax.inject.Named

class MyClass {

   @Inject
   @Nullable
   @Named("hello")
   lateinit var str : String

   @Inject
   @Nullable
   @Named("korea")
   lateinit var korea : String

   @Inject
   @Nullable
   @GoodBye
   lateinit var goodBye: String

}







