package com.example.jetpackdemo.ui.main

import android.os.Bundle
import androidx.navigation.Navigation
import com.example.jetpackdemo.R
import com.example.jetpackdemo.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_home.*

/**
 * create by shuguo
 * time: 2021/2/5 10:46
 * description:
 */
class HomeFragment : BaseFragment(){

    override fun setContentView(): Int {
        return R.layout.fragment_home
    }

    override fun initUI() {
        item_text.setOnClickListener {
            val args = Bundle()
            Navigation.findNavController(it).navigate(R.id.home_mmkv, args)
        }
    }

    override fun initData() {
    }

}