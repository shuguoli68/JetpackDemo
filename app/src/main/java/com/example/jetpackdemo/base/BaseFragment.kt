package com.example.jetpackdemo.base

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity

/**
 * create by shuguo
 * time: 2021/2/5 10:46
 * description:
 */
abstract class BaseFragment :Fragment(){

    protected lateinit var mContext: Context
    protected lateinit var mActivity: FragmentActivity
    protected var rootView:View? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        rootView = inflater.inflate(this.setContentView(), container, false)
        return rootView
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mContext = activity?.applicationContext!!
        mActivity = activity as FragmentActivity
        initUI()
        initData()
    }

    protected abstract fun setContentView(): Int
    protected abstract fun initUI()
    protected abstract fun initData()
}