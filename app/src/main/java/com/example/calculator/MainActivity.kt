package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            getSupportActionBar()!!.hide()

            val numberIds = intArrayOf(
                R.id.zero,
                R.id.one,
                R.id.two,
                R.id.three,
                R.id.four,
                R.id.five,
                R.id.six,
                R.id.seven,
                R.id.eight,
                R.id.nine)

            val actionIns :IntArray = intArrayOf(
                R.id.plus,
                R.id.minus,
                R.id.multiply,
                R.id.division
            )
            var calculator = CalculatorModel()
        }
}
