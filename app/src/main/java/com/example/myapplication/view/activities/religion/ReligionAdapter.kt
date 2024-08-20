package com.example.myapplication.view.activities.religion

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.myapplication.view.activities.religion.fragments.A25
import com.example.myapplication.view.activities.religion.fragments.A26
import com.example.myapplication.view.activities.religion.fragments.A27
import com.example.myapplication.view.activities.religion.fragments.A28

@Suppress("DEPRECATION")
internal class ReligionAdapter(
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
            2 -> {
                A27()
            }
            3 -> {
                A28()
            }


            else -> getItem(position)
        }
    }

    override fun getCount(): Int {
        return totalTabs
    }
}