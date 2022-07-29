package com.example.module_2_lesson_7_hw_1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_table.*

class TableFragment : Fragment() {

    private var numbers: Numbers? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_table, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        tvTable.text = numbers?.table
        tvSelectedNumber.text = numbers?.name
    }

    companion object {

        @JvmStatic
        fun newInstance(numbers: Numbers) =
            TableFragment().apply {
                this.numbers = numbers
            }
    }
}