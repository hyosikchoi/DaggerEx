package com.hyosik.android.daggerex

import com.hyosik.android.daggerex.component.DaggerCounterComponent
import com.hyosik.android.daggerex.component.DaggerMyComponent
import com.hyosik.android.daggerex.component.DaggerPersonComponent
import com.hyosik.android.daggerex.data.entity.Counter
import com.hyosik.android.daggerex.data.entity.MyClass
import com.hyosik.android.daggerex.data.entity.PersonB
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    // p.38
    @Test
    fun addition_isCorrect() {
        //val myComponent = DaggerMyComponent.create()
        //print("result : ${myComponent.getString()}")
    }
    // p.45
    @Test
    fun `test member injection`() {
        val myClass = MyClass()
        var str = myClass.str
        assertNotNull("조회 결과 null" , str)

//        val myComponent = DaggerMyComponent.create()
//        myComponent.inject(myClass = myClass)
//        str = myClass.str
//        assertEquals("Hello World" , str)
    }

    // p.46
    @Test
    fun `member injector`() {
        val myClass = MyClass()
        var str = ""
        println("result = ${str}")

        val myComponent = DaggerMyComponent.create()
        var injector = myComponent.getInjector()
        injector.injectMembers(myClass)
        str = myClass.str

        println("result = ${str}")
    }

    // p.49
    @Test
    fun `생성자 주입 및 필드 , 메서드 주입`() {
        val personComponent = DaggerPersonComponent.create()
        var personA = personComponent.getPersonA()
        println("${personA.name} : ${personA.age}")

        var personB = PersonB()
        personComponent.inject(personB = personB)
        assertEquals("HyoSik" , personB.name)
        assertEquals(100 , personB.age)
    }

    // p.54
    @Test
    fun `Lazy 주입`() {
        val component = DaggerCounterComponent.create()
        val counter = Counter()
        component.inject(counter = counter)
        counter.printLazy()
    }

    // p.55
    @Test
    fun `Provider 주입`() {
        val component = DaggerCounterComponent.create()
        val counter = Counter()
        component.inject(counter = counter)
        counter.printProvider()
    }

    // p.59
    @Test
    fun `Named 한정자 사용`() {
        val component = DaggerMyComponent.create()
        val myClass = MyClass()
        component.inject(myClass = myClass)
        println(myClass.korea)
        println(myClass.str)
    }

}