package com.example.jetpackdemo.ui.main

import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.jetpackdemo.R
import com.example.jetpackdemo.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_main.*

/**
 * create by shuguo
 * time: 2021/2/5 20:36
 * description:
 */
class MainFragment :BaseFragment(){

    override fun setContentView(): Int {
        return R.layout.fragment_main
    }

    override fun initUI() {
        val navController = Navigation.findNavController(mActivity, R.id.content)
        navigation.setupWithNavController(navController)
        navController.addOnDestinationChangedListener { controller, destination, arguments ->
            toolbar_title.text = destination.label
            when(destination.id){
                R.id.home_fragment -> {

                }
                R.id.message_fragment -> {

                }
                R.id.myself_fragment -> {

                }
            }
        }
    }

    override fun initData() {
    }
}