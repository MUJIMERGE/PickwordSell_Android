package com.smaryn.pws.and.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.smaryn.pws.and.R
import com.smaryn.pws.and.databinding.ActivityMainBinding
import com.smaryn.pws.and.fragment.SellPostFragment

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_main, SellPostFragment())
            .addToBackStack("SellPostTest")
            .commit()
    }
}