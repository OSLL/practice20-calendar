package com.makentoshe.androidgithubcitemplate

import android.os.Bundle
import android.widget.CalendarView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import com.makentoshe.androidgithubcitemplate.EventActivity



class MainActivity : AppCompatActivity() {
    //Дата, месяц и год

    public var date : Int = 0
    public var month : Int = 0
    public var year : Int = 0

    init {
        // По умолчанию выставляются текущие дата, месяц, год
        val c = Calendar.getInstance()
        date = c.get(Calendar.DATE);
        month = c.get(Calendar.MONTH);
        year = c.get(Calendar.YEAR);
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Клик по дате в календаре
        calendar_view.setOnDateChangeListener(object : CalendarView.OnDateChangeListener {
            override fun onSelectedDayChange(p0: CalendarView, p1: Int, p2: Int, p3: Int) {
                date = p3
                month = p2 + 1
                year = p1
            }
        })

        // Клик по кнопке добалвения события
        fab.setOnClickListener {
            val event = EventActivity()
            event.createEvent(date, month, year)

            Toast.makeText(this, "Button click. The selected date is $date. $month .$year", Toast.LENGTH_LONG).show()
        }
    }


}


