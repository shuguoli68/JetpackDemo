package com.example.jetpackdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.main_activity.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        initUI()
    }

    private fun initUI() {
        val host: NavHostFragment = supportFragmentManager.findFragmentById(R.id.content) as NavHostFragment
        val navController = host.navController
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

}
