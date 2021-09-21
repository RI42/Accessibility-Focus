package com.example.accesstestproject.ui.access

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.accesstestproject.R

val TAB = arrayOf(
    R.string.tab_text_1 to ::FewFragment,
    R.string.tab_text_2 to ::ManyFragment
)


class SectionsPagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {


    override fun getItemCount(): Int = TAB.size

    override fun createFragment(position: Int): Fragment = TAB[position].second.invoke()
}