package com.example.module_2_lesson_7_hw_1

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class TableAdapter (val tables: ArrayList<Numbers>, fm: FragmentManager) : FragmentPagerAdapter(fm){
    override fun getCount(): Int {
        return tables.size
    }

    override fun getItem(position: Int): Fragment = TableFragment.newInstance(tables[position])
}