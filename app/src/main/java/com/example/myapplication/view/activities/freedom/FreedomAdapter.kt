package com.example.myapplication.view.activities.freedom

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.myapplication.view.activities.freedom.fragments.A19
import com.example.myapplication.view.activities.freedom.fragments.A20
import com.example.myapplication.view.activities.freedom.fragments.A21
import com.example.myapplication.view.activities.freedom.fragments.A22

@Suppress("DEPRECATION")
internal class FreedomAdapter(
    var context: Context,
    fm: FragmentManager,
    var totalTabs: Int
) :
    FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                A19()
            }
            1 -> {
                A20()
            }
            2 -> {
                A21()
            }
            3 ->{
                A22()
            }

            else -> getItem(position)
        }
    }

    override fun getCount(): Int {
        return totalTabs
    }
}