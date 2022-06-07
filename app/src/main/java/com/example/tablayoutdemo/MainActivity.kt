package com.example.tablayoutdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.tablayoutdemo.adapter.MyAdapter
import com.example.tablayoutdemo.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var tabLayout:TabLayout
    private lateinit var viewPager: ViewPager2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.run {
            tabLayout.addTab(tabLayout.newTab().setText("HOME"))
            tabLayout.addTab(tabLayout.newTab().setText("PROFILE"))
            tabLayout.addTab(tabLayout.newTab().setText("SETTINGS"))
            tabLayout.tabGravity= TabLayout.GRAVITY_FILL
            val adapter = MyAdapter(this,supportFragmentManager,tabLayout.tabCount)
            viewPager.adapter=adapter
            viewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tabLayout))
            tabLayout.addOnTabSelectedListener(object :TabLayout.OnTabSelectedListener{
                override fun onTabSelected(tab: TabLayout.Tab?) {
                    viewPager.currentItem= tab!!.position
                }

                override fun onTabUnselected(tab: TabLayout.Tab?) {

                }

                override fun onTabReselected(tab: TabLayout.Tab?) {

                }

            }
            )
        }

    }
}