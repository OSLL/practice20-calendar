package com.makentoshe.androidgithubcitemplate

import android.widget.Toast
import android.os.Bundle
import android.widget.CalendarView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class EventActivity {
    public fun createEvent(date:Int, month:Int, year:Int) {

        /*

                Код открытия формы добавления события
                ! Дата, месяц и год заполняются автоматически из меременных date, month, year, которые выставляются при клике на дату в календаре

             */

        println("Button click. The selected date is $date. $month .$year")

    }
}