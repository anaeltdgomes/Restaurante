package javatpoint.app.restaurante

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Spinner
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.textfield.TextInputLayout
import java.time.Month

class Reserva: Fragment()  {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.reserva_layout, container, false)

        val editNome:TextInputLayout = view.findViewById(R.id.edit_nome)
        val editPhone:TextInputLayout = view.findViewById(R.id.edit_phone)
        val btnEnviar:Button = view.findViewById(R.id.btn_enviar)

        view.findViewById<Button>(R.id.pickDate).setOnClickListener {
            val dateFragment = DatePickerFragment()
            dateFragment.show(getParentFragmentManager(), "datePicker")
        }

        // Cria um array com os quatro RadioButtons
        val rb = arrayOf<RadioButton>(view.findViewById(R.id.um),
            view.findViewById(R.id.dois),
            view.findViewById(R.id.tres),
            view.findViewById(R.id.quatro))

        // Adiciona ao Spinner uma array com todos os horários de reserva
        val horarios = resources.getStringArray(R.array.horarios)
        val spinner = view.findViewById<Spinner>(R.id.mySpinner)
        val adapter = ArrayAdapter(this.requireContext(),
            android.R.layout.simple_spinner_item, horarios)
        spinner.adapter = adapter

        spinner.onItemSelectedListener = object :
            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {

            }
            override fun onNothingSelected(parent: AdapterView<*>) {
            }
        }

        btnEnviar.setOnClickListener {
            if(!rb[0].isChecked && !rb[1].isChecked && !rb[2].isChecked && !rb[3].isChecked){
                Toast.makeText(context,"Preecha todos os campos corretamente!", Toast.LENGTH_SHORT).show()
            }
            else if(editNome.editText!!.text.toString().trim() == "" || editNome.editText!!.text == null){
                Toast.makeText(context,"Preecha seu nome corretamente!", Toast.LENGTH_SHORT).show()
            }
            else if(editPhone.editText!!.text.toString().trim() == "" || editNome.editText!!.text == null){
                Toast.makeText(context,"Preecha seu telefone corretamente!", Toast.LENGTH_SHORT).show()
            }
            else {
                Toast.makeText(context,"Seu pedido de reserva foi recebido!", Toast.LENGTH_SHORT).show()
            }
        }

        return view
    }
}