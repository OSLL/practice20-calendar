package com.makentoshe.androidgithubcitemplate

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils.loadAnimation
import android.widget.Button
import android.widget.CalendarView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.view.animation.AnimationUtils
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {
    //Дата, месяц и год

    public var date : Int = 0
    public var month : Int = 0
    public var year : Int = 0

    init {
        // По умолчанию выставляются текущие дата, месяц, год
        val c = Calendar.getInstance()
        date = c.get(Calendar.DATE);
        month = c.get(Calendar.MONTH)+1;
        year = c.get(Calendar.YEAR);
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Клик по дате в календаре
        calendar_view.setOnDateChangeListener(object : CalendarView.OnDateChangeListener {
            override fun onSelectedDayChange(p0: CalendarView, p1: Int, p2: Int, p3: Int) {
                if (date == p3 && month==p2 + 1 && year == p1) {

                    /*

                    Модуль по открытию страницы событий на дату

                     */

                    Toast.makeText(applicationContext, "Double click", Toast.LENGTH_LONG).show()
                }

                date = p3
                month = p2 + 1
                year = p1

                //Показывает либо скрывает кнопку возвращения к текущей дате
                retrunButtonHideShow(date,month,year)
            }
        })

        //Возврат к текущей дате
        returnToCurrent.setOnClickListener{

            val c = Calendar.getInstance()

            date = c.get(Calendar.DATE)
            month = c.get(Calendar.MONTH);
            year = c.get(Calendar.YEAR);

            val calendar = Calendar.getInstance()
            calendar[Calendar.YEAR] = year
            calendar[Calendar.MONTH] = month
            calendar[Calendar.DAY_OF_MONTH] = date

            val milliTime = calendar.timeInMillis

            calendar_view.setDate (milliTime, true, true);
            hideView()
        }

        // Клик по кнопке добалвения события
        addEvent.setOnClickListener {
            val intent = Intent(this, EventActivity::class.java)
            startActivity(intent)

        }
    }

    public fun retrunButtonHideShow(d:Int,m:Int,y:Int) {
        if (!ifCurrentDate(d,m,y)) {
            showView()
        } else {
            hideView()
        }
    }

    //Проверка даты на совпадение с текущей
    public fun ifCurrentDate(d:Int,m:Int,y:Int) : Boolean {
        val c = Calendar.getInstance()

        if (c.get(Calendar.DATE) == d && m == c.get(Calendar.MONTH)+1 && y == c.get(Calendar.YEAR)) {
            return true
        }
        return false
    }

    public fun showView() {
        var b : View = findViewById<FloatingActionButton>(R.id.returnToCurrent)
        var popup = AnimationUtils.loadAnimation(this, R.anim.scale_up);
        if (b.visibility == View.INVISIBLE) {
            b.startAnimation(popup);
            b.visibility = View.VISIBLE
        }
    }

    public fun hideView() {
        var b : View = findViewById<FloatingActionButton>(R.id.returnToCurrent)
        var popdown = AnimationUtils.loadAnimation(this, R.anim.scale_down);
        if (b.visibility == View.VISIBLE) {
            b.startAnimation(popdown);
            b.visibility = View.INVISIBLE
        }

    }


}


