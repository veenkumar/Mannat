package com.mannat.utils.dates

import android.app.DatePickerDialog
import android.app.Dialog
import android.os.Bundle
import android.widget.DatePicker
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import com.mannat.utils.CommonUtils.correctDate
import java.util.*

class PreviousDatePicker : DialogFragment(), DatePickerDialog.OnDateSetListener {
    private var date: StringBuilder? = null
    private var day: Int? = null
    private var setOnDateOfBirth: SetOnDateOfBirth? = null
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        day = c.get(Calendar.DAY_OF_MONTH)
        val hideUnusedDate = DatePickerDialog(requireContext(), this, year, month, day!! - 0)
        hideUnusedDate.datePicker.maxDate = c.timeInMillis
        return hideUnusedDate
    }

    override fun onDateSet(p0: DatePicker?, year: Int, month: Int, day: Int) {
        val userAge: Calendar = GregorianCalendar(year, month, day)
        val minAdultAge: Calendar = GregorianCalendar()
        minAdultAge.add(Calendar.DAY_OF_MONTH, -0)
        if (minAdultAge.before(userAge)) {
            Toast.makeText(
                requireContext(),
                correctDate,
                Toast.LENGTH_LONG
            )
                .show()
        } else {
            date = StringBuilder().append(year)
                .append("-").append(month + 1).append("-").append(day)
                .append(" ")
            setOnDateOfBirth?.setDateOfBirth(date!!)
        }
    }

    fun setOnDateOfBirth(setOnDateOfBirth: SetOnDateOfBirth) {
        this.setOnDateOfBirth = setOnDateOfBirth
    }

    interface SetOnDateOfBirth {
        fun setDateOfBirth(date: StringBuilder?)
    }
}