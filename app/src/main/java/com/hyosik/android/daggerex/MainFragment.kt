package com.hyosik.android.daggerex

import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.view.View
import com.hyosik.android.daggerex.data.qualifier.FragmentScope
import com.hyosik.android.daggerex.databinding.FragmentMainBinding
import dagger.Module
import dagger.Provides
import dagger.android.support.AndroidSupportInjection
import java.util.*
import javax.inject.Inject

class MainFragment : BaseFragment<FragmentMainBinding>() {

    override fun getViewBinding(): FragmentMainBinding = FragmentMainBinding.inflate(layoutInflater)

    @Inject
    lateinit var sharedPreferences: SharedPreferences

    @Inject
    lateinit var activityName : String

    @set:[Inject] var randomNumber : Int = 0


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // MainActivity 로부터 DispatchAndroidInjector 를 받는다.
        // 그 후에 MainActivity 에 걸맞는 AndroidInjector.Factory를 클래스 이름을 통해 찾는다.
        // Factory 를 통해 생성된 MainActivitySubComponent는 액티비티에서 호출한 inject()를  통해 의존성 주입이 완료된다.
        AndroidSupportInjection.inject(this)

//        if(activity is MainActivity) {
//            (activity as MainActivity).component
//                .mainFragmentComponentBuilder()
//                .setFragmentModule(MainFragmentModule())
//                .setFragment(this)
//                .build()
//                .inject(this)
//        }

        Log.d("MainFragment" , activityName)
        Log.d("MainFragment" , "randomNumber: ${randomNumber}")

    }
}