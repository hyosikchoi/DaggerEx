package com.hyosik.android.daggerex

import com.hyosik.android.daggerex.component.DaggerMyComponent
import com.hyosik.android.daggerex.data.entity.MyClass
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        //val myComponent = DaggerMyComponent.create()
        //print("result : ${myComponent.getString()}")
    }

    @Test
    fun `test member injection`() {
        val myClass = MyClass()
        var str = myClass.str
        assertNotNull("조회 결과 null" , str)

        val myComponent = DaggerMyComponent.create()
        myComponent.inject(myClass = myClass)
        str = myClass.str
        assertEquals("Hello World" , str)
    }

}