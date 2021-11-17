package com.nanda.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayoutMediator
import com.nanda.newsapp.databinding.ActivityMainBinding
import com.nanda.newsapp.databinding.ActivitySplashScreenBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        binding.vpNews.adapter = SectionPagerAdapter(this)

        val tabList = arrayOf("All News", "Top News", "Popular")
        TabLayoutMediator(binding.tabs, binding.vpNews){
            tab , position -> tab.text = tabList[position]
        }.attach()
    }
}