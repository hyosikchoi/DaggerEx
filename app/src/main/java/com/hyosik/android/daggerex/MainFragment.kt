package com.hyosik.android.daggerex

import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.view.View
import com.hyosik.android.daggerex.databinding.FragmentMainBinding
import com.hyosik.android.daggerex.module.MainFragmentModule
import javax.inject.Inject

class MainFragment : BaseFragment<FragmentMainBinding>(){

    override fun getViewBinding(): FragmentMainBinding = FragmentMainBinding.inflate(layoutInflater)

    @Inject
    lateinit var sharedPreferences: SharedPreferences

    @Inject
    lateinit var activityName : String

    @set:[Inject] var randomNumber : Int = 0

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if(activity is MainActivity) {
            (activity as MainActivity).component
                .mainFragmentComponentBuilder()
                .setFragmentModule(MainFragmentModule())
                .setFragment(this)
                .build()
                .inject(this)
        }

        Log.d("MainFragment" , activityName)
        Log.d("MainFragment" , "randomNumber: ${randomNumber}")

    }

}