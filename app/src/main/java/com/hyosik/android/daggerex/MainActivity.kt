package com.hyosik.android.daggerex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hyosik.android.daggerex.component.DaggerMyComponent
import com.hyosik.android.daggerex.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun getViewBinding(): ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        val myComponent = DaggerMyComponent.create()
//        binding.titleTextView.text = myComponent.getString()

    }
}