package com.carloscolt.horoscapp.ui.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.carloscolt.horoscapp.R
import com.carloscolt.horoscapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding
    private lateinit var navControler: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUI()

    }

    private fun initUI() {
        initNavigation()
    }

    private fun initNavigation() {
        val navHost = supportFragmentManager.findFragmentById(R.id.fcView) as NavHostFragment
        navControler = navHost.navController
        binding.btNavView.setupWithNavController(navControler)
    }
}