package com.example.jetpackdemo.base

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import io.reactivex.rxjava3.disposables.CompositeDisposable
import io.reactivex.rxjava3.disposables.Disposable

/**
 * create by shuguo
 * time: 2021/2/5 10:46
 * description:
 */
abstract class BaseFragment :Fragment(){

    protected lateinit var mContext: Context
    protected lateinit var mActivity: FragmentActivity
    protected var rootView:View? = null
    private var compositeDisposable: CompositeDisposable? = null

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

    override fun onDestroyView() {
        super.onDestroyView()
        delDisposable()
    }

    protected abstract fun setContentView(): Int
    protected abstract fun initUI()
    protected abstract fun initData()

    /**
     * rxjava管理订阅者
     */
    protected fun addDisposable(disposable: Disposable) {
        if (compositeDisposable == null) {
            compositeDisposable = CompositeDisposable()
        }
        compositeDisposable!!.add(disposable)
    }

    /**
     * 解除订阅关系
     */
    protected fun delDisposable(){
        compositeDisposable?.clear()
        compositeDisposable = null
    }
}