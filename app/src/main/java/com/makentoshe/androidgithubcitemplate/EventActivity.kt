package com.makentoshe.androidgithubcitemplate

import android.app.DatePickerDialog
import android.app.DatePickerDialog.OnDateSetListener
import android.app.TimePickerDialog
import android.app.TimePickerDialog.OnTimeSetListener
import android.os.Bundle
import android.text.InputType
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import java.util.*


class EventActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_event)

        val datePicker : EditText = findViewById(R.id.date)
        datePicker.setRawInputType(InputType.TYPE_NULL)
        datePicker.setOnClickListener {
            val cldr : Calendar = Calendar.getInstance()
            val day: Int = cldr.get(Calendar.DAY_OF_MONTH)
            val month: Int = cldr.get(Calendar.MONTH)
            val year: Int = cldr.get(Calendar.YEAR)
            // date picker dialog
            val picker = DatePickerDialog(
                this@EventActivity,
                OnDateSetListener { view, year, monthOfYear, dayOfMonth -> datePicker.setText(dayOfMonth.toString() + "/" + (monthOfYear + 1) + "/" + year) },
                year,
                month,
                day
            )
            picker.show()
        }

        val timePicker : EditText = findViewById(R.id.time)
        timePicker.setRawInputType(InputType.TYPE_NULL)
        timePicker.setOnClickListener {
            val cldr : Calendar = Calendar.getInstance()
            val hour: Int = cldr.get(Calendar.DAY_OF_MONTH)
            val minutes: Int = cldr.get(Calendar.MONTH)
            // time picker dialog
            val picker = TimePickerDialog(
                this@EventActivity,
                OnTimeSetListener { tp, sHour, sMinute -> timePicker.setText("$sHour:$sMinute")  },
                hour,
                minutes,
                true
            )
            picker.show()
        }


    }
}