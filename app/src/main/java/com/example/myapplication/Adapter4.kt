package com.example.myapplication

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
@Suppress("DEPRECATION")
internal class Adapter4(
    var context: Context,
    fm: FragmentManager,
    var totalTabs: Int
) :
    FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                A25()
            }
            1 -> {
                A26()
            }
            1 -> {
                A27()
            }
            1 -> {
                A28()
            }


            else -> getItem(position)
        }
    }

    override fun getCount(): Int {
        return totalTabs
    }
}