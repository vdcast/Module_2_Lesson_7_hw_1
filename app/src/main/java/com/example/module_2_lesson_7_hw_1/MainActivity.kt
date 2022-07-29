package com.example.module_2_lesson_7_hw_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.PagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tables = getTables()

        vpTable.adapter = TableAdapter(tables,supportFragmentManager)

        tvOne.setOnClickListener {
            vpTable.currentItem = 0
        }
        tvTwo.setOnClickListener {
            vpTable.currentItem = 1
        }
        tvThree.setOnClickListener {
            vpTable.currentItem = 2
        }
        tvFour.setOnClickListener {
            vpTable.currentItem = 3
        }
        tvFive.setOnClickListener {
            vpTable.currentItem = 4
        }
        tvSix.setOnClickListener {
            vpTable.currentItem = 5
        }
        tvSeven.setOnClickListener {
            vpTable.currentItem = 6
        }
        tvEight.setOnClickListener {
            vpTable.currentItem = 7
        }
        tvNine.setOnClickListener {
            vpTable.currentItem = 8
        }
        tvTen.setOnClickListener {
            vpTable.currentItem = 9
        }
            }

    fun getTables(): ArrayList<Numbers>{
        val tables = ArrayList<Numbers>()
        tables.add(Numbers("1",resources.getString(R.string.one_table)))
        tables.add(Numbers("2",resources.getString(R.string.two_table)))
        tables.add(Numbers("3",resources.getString(R.string.three_table)))
        tables.add(Numbers("4",resources.getString(R.string.four_table)))
        tables.add(Numbers("5",resources.getString(R.string.five_table)))
        tables.add(Numbers("6",resources.getString(R.string.six_table)))
        tables.add(Numbers("7",resources.getString(R.string.seven_table)))
        tables.add(Numbers("8",resources.getString(R.string.eight_table)))
        tables.add(Numbers("9",resources.getString(R.string.nine_table)))
        tables.add(Numbers("10",resources.getString(R.string.ten_table)))
        return tables
    }
}