package javatpoint.app.restaurante

import android.app.DatePickerDialog
import android.app.Dialog
import android.os.Bundle
import android.widget.DatePicker
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import java.time.LocalDate
import java.util.Calendar
import java.util.GregorianCalendar

class DatePickerFragment : DialogFragment(), DatePickerDialog.OnDateSetListener {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        // Use the current date as the default date in the picker.
        val year:Int = GregorianCalendar().get(Calendar.YEAR)
        val month:Int = GregorianCalendar().get(Calendar.MONTH)
        val day:Int = GregorianCalendar().get(Calendar.DAY_OF_MONTH)

        // Create a new instance of DatePickerDialog and return it.
        return DatePickerDialog(requireContext(), this, year, month, day)
    }

    override fun onDateSet(view: DatePicker, year: Int, month: Int, day: Int) {
        // Recebe data de hoje
        val nowYear: Int = GregorianCalendar().get(Calendar.YEAR)
        val nowMonth: Int = GregorianCalendar().get(Calendar.MONTH)
        val nowDay: Int = GregorianCalendar().get(Calendar.DAY_OF_MONTH)

        val userDate:LocalDate = LocalDate.of(year,month+1,day)          // Data escolhida pelo usuário
        val nowDate:LocalDate = LocalDate.of(nowYear,nowMonth+1,nowDay)  // Data de hoje
        var week: String = userDate.dayOfWeek.toString()

        when (week) {
            "MONDAY" -> week = "Segunda"
            "TUESDAY" -> week = "Terça"
            "WEDNESDAY" -> week = "Quarta"
            "THURSDAY" -> week = "Quinta"
            "FRIDAY" -> week = "Sexta"
            "SATURDAY" -> week = "Sábado"
            "SUNDAY" -> week = "Domingo"
        }
        // Compara a data atual com a escolhida pelo usuário
        if (nowDate.isAfter(userDate)) {
            Toast.makeText(context, "Erro - Escolha uma data futura!", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(context, "Reservado para $week dia: $day/${month + 1}", Toast.LENGTH_SHORT).show()
        }
    }
}
