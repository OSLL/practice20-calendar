package com.makentoshe.androidgithubcitemplate

import android.os.Bundle
import android.widget.CalendarView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Button

class MainActivity : AppCompatActivity() {
    public var date : Int = 0
    public var month : Int = 0
    public var year : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        calendar_view.setOnDateChangeListener(object : CalendarView.OnDateChangeListener {
            override fun onSelectedDayChange(p0: CalendarView, p1: Int, p2: Int, p3: Int) {
                date = p3
                month = p2 + 1
                year = p1
            }
        })

        // get reference to button
        fab.setOnClickListener {
            Toast.makeText(this, "Button click. The selected date is $date. $month .$year", Toast.LENGTH_LONG).show()
        }
    }


}


