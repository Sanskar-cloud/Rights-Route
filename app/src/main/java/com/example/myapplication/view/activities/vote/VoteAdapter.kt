package com.example.myapplication.view.activities.vote

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.myapplication.view.activities.vote.fragments.A326

@Suppress("DEPRECATION")
internal class VoteAdapter(
    var context: Context,
    fm: FragmentManager,
    var totalTabs: Int
) :
    FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                A326()
            }


            else -> getItem(position)
        }
    }

    override fun getCount(): Int {
        return totalTabs
    }
}