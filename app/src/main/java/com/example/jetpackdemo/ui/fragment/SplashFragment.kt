package com.example.jetpackdemo.ui.fragment

import android.os.Bundle
import androidx.navigation.Navigation
import com.example.jetpackdemo.R
import com.example.jetpackdemo.base.BaseFragment
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Flowable
import kotlinx.android.synthetic.main.fragment_splash.*
import java.util.*
import java.util.concurrent.TimeUnit

/**
 * create by shuguo
 * time: 2021/2/6 14:44
 * description:
 */
class SplashFragment :BaseFragment(){

    override fun setContentView(): Int {
        return R.layout.fragment_splash
    }

    override fun initUI() {

    }

    override fun initData() {
    }
}