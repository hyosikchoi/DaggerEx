package com.hyosik.android.daggerex

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hyosik.android.daggerex.component.DaggerAppComponent
import com.hyosik.android.daggerex.component.DaggerMyComponent
import com.hyosik.android.daggerex.component.MainActivityComponent
import com.hyosik.android.daggerex.databinding.ActivityMainBinding
import com.hyosik.android.daggerex.module.MainActivityModule
import javax.inject.Inject

class MainActivity : BaseActivity<ActivityMainBinding>() {

    @Inject
    lateinit var sharedPreferences : SharedPreferences

    @Inject
    lateinit var activityName : String

    lateinit var component: MainActivityComponent

    override fun getViewBinding(): ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        component = (application as App).getComponent()
            .mainActivityComponentBuilder()
            .setModule(MainActivityModule())
            .setActivity(this)
            .build().also { it.inject(this) }

        supportFragmentManager.beginTransaction()
            .replace(R.id.container, MainFragment())
            .commit()

    }

    fun getMainActivityComponent() : MainActivityComponent = component

}