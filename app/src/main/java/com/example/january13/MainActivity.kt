package com.example.january13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.january13.adapter.ViewPager
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {


    private lateinit var  viewPager2: ViewPager2
    private lateinit var tabLayout: TabLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        viewPager2 =findViewById(R.id.viewpager)
        tabLayout = findViewById(R.id.tabs)


        viewPager2.adapter = ViewPager(this)

        TabLayoutMediator(tabLayout,viewPager2){
            tab, position ->
            viewPager2.currentItem = 1
            when(position){
                0 -> tab.text = "Left"
                1 -> tab.text = "Main"
                2 -> tab.text = "Right"
            }
        }.attach()




    }
}