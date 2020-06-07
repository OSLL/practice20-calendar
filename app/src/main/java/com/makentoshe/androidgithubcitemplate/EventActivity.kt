package com.makentoshe.androidgithubcitemplate

import android.app.DatePickerDialog
import android.app.DatePickerDialog.OnDateSetListener
import android.app.TimePickerDialog
import android.app.TimePickerDialog.OnTimeSetListener
import android.content.Intent
import android.os.Bundle
import android.text.InputType
import android.view.View
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputLayout
import fr.ganfra.materialspinner.MaterialSpinner
import kotlinx.android.synthetic.main.activity_event.*
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class EventActivity : AppCompatActivity() {

    private lateinit var textInputTitle: TextInputLayout
    private lateinit var textInputDescription: TextInputLayout
    private lateinit var datePicker: EditText
    private lateinit var timePicker: EditText
    private lateinit var category: MaterialSpinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_event)

        this.textInputTitle = findViewById(R.id.title)
        this.textInputDescription = findViewById(R.id.description)
        this.timePicker = findViewById(R.id.time)
        this.datePicker = findViewById(R.id.date)
        this.category = findViewById(R.id.category)


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

        /*
        discardButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        */

        val ITEMS =
            arrayOf("Deadlines", "Daily routine", "Holidays", "Entertainment", "Meetings")
        val adapter =
            ArrayAdapter(this, R.layout.item_spinner, ITEMS)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        val spinner = findViewById(R.id.category) as MaterialSpinner
        spinner.setAdapter(adapter)


    }

    private fun validateTitle(): Boolean {
        val titleInput: String = textInputTitle.editText?.text.toString().trim()
        return if (titleInput.isEmpty()) {
            textInputTitle.error = "Field can't be empty"
            false
        } else {
            textInputTitle.error = null
            true
        }
    }

    private fun validateDate(): Boolean {
        val dateInput: String = datePicker.text.toString().trim()
        return if (dateInput.isEmpty()) {
            datePicker.error = "Field can't be empty"
            false
        } else {
            datePicker.error = null
            true
        }
    }

    private fun validateTime(): Boolean {
        val timeInput: String = timePicker.text.toString().trim()
        return if (timeInput.isEmpty()) {
            timePicker.error = "Field can't be empty"
            false
        } else {
            timePicker.error = null
            true
        }
    }



    fun confirmInput(v: View?) {
        if (!validateTitle() || !validateDate() || !validateTime()) {
            return
        }

        var title = textInputTitle.editText?.text.toString()
        var description = textInputDescription.editText?.text.toString()
        var date = datePicker.text.toString()
        var time = timePicker.text.toString()
        var category = category.selectedItem

        /*

        Сохранение события в память/БД

         */

        var input = "Title: $title"
        input += "\n"
        input += "Description: $description"
        input += "\n"
        input += "Date: $date"
        input += "\n"
        input += "Time: $time"
        input += "\n"
        input += "Category: $category"
        Toast.makeText(this, input, Toast.LENGTH_SHORT).show()
    }
}