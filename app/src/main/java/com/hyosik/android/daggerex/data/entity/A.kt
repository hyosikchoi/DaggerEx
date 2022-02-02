package com.hyosik.android.daggerex.data.entity

data class A(
    val id : Long,
    val title : String
) {
    constructor() : this(0L , "")
}
