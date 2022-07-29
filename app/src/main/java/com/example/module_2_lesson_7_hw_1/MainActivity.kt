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

        tvOne.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.flTable,TableFragment.newInstance(tables[0]))
                .commit()
        }
        tvTwo.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.flTable,TableFragment.newInstance(tables[1]))
                .commit()
        }
        tvThree.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.flTable,TableFragment.newInstance(tables[2]))
                .commit()
        }
        tvFour.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.flTable,TableFragment.newInstance(tables[3]))
                .commit()
        }
        tvFive.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.flTable,TableFragment.newInstance(tables[4]))
                .commit()
        }
        tvSix.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.flTable,TableFragment.newInstance(tables[5]))
                .commit()
        }
        tvSeven.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.flTable,TableFragment.newInstance(tables[6]))
                .commit()
        }
        tvEight.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.flTable,TableFragment.newInstance(tables[7]))
                .commit()
        }
        tvNine.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.flTable,TableFragment.newInstance(tables[8]))
                .commit()
        }
        tvTen.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.flTable,TableFragment.newInstance(tables[9]))
                .commit()
        }

        tvHello.setOnClickListener {
            vpTable.adapter = TableAdapter(tables,supportFragmentManager)
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