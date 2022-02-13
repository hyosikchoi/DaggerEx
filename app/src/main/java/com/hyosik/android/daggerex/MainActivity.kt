package com.hyosik.android.daggerex

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.hyosik.android.daggerex.component.DaggerAppComponent
import com.hyosik.android.daggerex.component.DaggerMyComponent
import com.hyosik.android.daggerex.component.MainActivityComponent
import com.hyosik.android.daggerex.databinding.ActivityMainBinding
import com.hyosik.android.daggerex.module.MainActivityModule
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class MainActivity : BaseActivity<ActivityMainBinding>(){

    @Inject
    lateinit var sharedPreferences : SharedPreferences

    @Inject
    lateinit var activityName : String

    override fun getViewBinding(): ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // App 으로 부터 DispatchAndroidInjector 를 받는다.
        // 그 후에 MainActivity 에 걸맞는 AndroidInjector.Factory를 클래스 이름을 통해 찾는다.
        // Factory 를 통해 생성된 MainActivitySubComponent는 액티비티에서 호출한 inject()를  통해 의존성 주입이 완료된다.
        AndroidInjection.inject(this)
        Log.d("MainActivity" , sharedPreferences.toString())
        Log.d("MainActivity" , "activityName : ${activityName}")
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, MainFragment())
            .commit()
    }
}