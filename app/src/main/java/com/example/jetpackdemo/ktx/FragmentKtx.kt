package com.example.jetpackdemo.ktx

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory

/**
 * create by shuguo
 * time: 2021/2/5 14:19
 * description:
 */

/**实例化 Fragment*/
inline fun <reified T : Fragment> Context.newInstanceFragment(): T {
    val args = Bundle()
    val className = T::class.java.name;
    val clazz = FragmentFactory.loadFragmentClass(
        classLoader, className)
    val f = clazz.getConstructor().newInstance()
    args.classLoader = f.javaClass.classLoader
    f.arguments = args
    return f as T
}

/**实例化 Fragment*/
inline fun <reified T : Fragment> Context.newInstanceFragment(args: Bundle?): T {
    val className = T::class.java.name;
    val clazz = FragmentFactory.loadFragmentClass(
        classLoader, className)
    val f = clazz.getConstructor().newInstance()
    if (args != null) {
        args.classLoader = f.javaClass.classLoader
        f.arguments = args
    }
    return f as T
}
