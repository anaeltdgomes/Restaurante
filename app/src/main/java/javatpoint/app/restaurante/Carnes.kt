package javatpoint.app.restaurante

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment

class Carnes: Fragment(), View.OnClickListener  {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val mostrar: View = inflater.inflate(R.layout.carnes_layout, container, false)

        mostrar.findViewById<ImageView>(R.id.img_bolinho_de_linguica_blumenau)?.setOnClickListener(this)
        mostrar.findViewById<TextView>(R.id.txt_bolinho_de_linguica_blumenau)?.setOnClickListener(this)
        mostrar.findViewById<ImageView>(R.id.img_contra_file_parmegiana)?.setOnClickListener(this)
        mostrar.findViewById<TextView>(R.id.txt_contra_file_parmegiana)?.setOnClickListener(this)
        mostrar.findViewById<ImageView>(R.id.img_file_de_peixe_a_dore)?.setOnClickListener(this)
        mostrar.findViewById<TextView>(R.id.txt_file_de_peixe_a_dore)?.setOnClickListener(this)
        mostrar.findViewById<ImageView>(R.id.img_file_de_peixe_empanado_frito)?.setOnClickListener(this)
        mostrar.findViewById<TextView>(R.id.txt_file_de_peixe_empanado_frito)?.setOnClickListener(this)
        mostrar.findViewById<ImageView>(R.id.img_file_de_peixe_parmegiana)?.setOnClickListener(this)
        mostrar.findViewById<TextView>(R.id.txt_file_de_peixe_parmegiana)?.setOnClickListener(this)
        mostrar.findViewById<ImageView>(R.id.img_frango_a_passarinho_da_rainha)?.setOnClickListener(this)
        mostrar.findViewById<TextView>(R.id.txt_frango_a_passarinho_da_rainha)?.setOnClickListener(this)
        mostrar.findViewById<ImageView>(R.id.img_peixe_a_dore_com_molho_tartaro)?.setOnClickListener(this)
        mostrar.findViewById<TextView>(R.id.txt_peixe_a_dore_com_molho_tartaro)?.setOnClickListener(this)
        mostrar.findViewById<ImageView>(R.id.img_peixe_empanado_com_molho_tartaro)?.setOnClickListener(this)
        mostrar.findViewById<TextView>(R.id.txt_peixe_empanado_com_molho_tartaro)?.setOnClickListener(this)

        return mostrar
    }

    override fun onClick(view: View){
        when (view.id) {
            R.id.img_bolinho_de_linguica_blumenau, R.id.txt_bolinho_de_linguica_blumenau -> {
                showAlertDialog("Bolinho de Linguiça Blumenau",
                    "Delicioso bolinho recheado com linguiça blumenau, acompanhado com maionese especial e limão.")
            }
            R.id.img_contra_file_parmegiana, R.id.txt_contra_file_parmegiana -> {
                showAlertDialog("Contra Filé Parmegiana",
                    "O Contra Filé Parmegiana é um prato robusto, destinado a servir de 2 a 3 pessoas. Composto por três cortes generosos de Contra Filé, cada um pesando 200 gramas, este prato apresenta uma experiência gastronômica suculenta e deliciosa. Cada pedaço de carne é meticulosamente coberto com um molho artesanal, feito a partir de tomates frescos, conferindo um sabor único e marcante. Acompanha, ainda, arroz soltinho, um feijão intensamente saboroso e fritas crocantes. Esta combinação irresistível faz do Contra Filé Parmegiana a escolha perfeita para quem busca uma refeição completa e extremamente satisfatória. Venha degustar e encante-se com este clássico da culinária brasileira, uma das deliciosas Parmegianas da Rainha!")
            }
            R.id.img_file_de_peixe_a_dore, R.id.txt_file_de_peixe_a_dore -> {
                showAlertDialog("Filé de peixe à dorê",
                    "Peixe à dorê é uma receita conhecida da maioria dos brasileiros. O nome pode mudar de acordo com a região, mas quem não adora um filezinho de peixe?")
            }
            R.id.img_file_de_peixe_empanado_frito, R.id.txt_file_de_peixe_empanado_frito -> {
                showAlertDialog("Filé de peixe empanado frito",
                    "Produto preparado! Pronto para o consumo, acompanhado com maionese especial e limão.")
            }
            R.id.img_file_de_peixe_parmegiana, R.id.txt_file_de_peixe_parmegiana -> {
                showAlertDialog("Filé de Peixe Parmegiana",
                    "O Filé de Peixe Parmegiana é um prato delicioso e suculento que certamente irá agradar ao seu paladar. Cada porção é composta por três generosos filés de Peixe Parmegiana coberto com molho artesanal feitos com tomates frescos, acompanhados de arroz soltinho, saboroso feijão e fritas. Essa combinação irresistível é perfeita para quem busca uma refeição completa e satisfatória. Experimente agora mesmo o Filé de Peixe Parmegiana e sinta o sabor único e marcante desse prato clássico da culinária brasileira.")
            }
            R.id.img_frango_a_passarinho_da_rainha, R.id.txt_frango_a_passarinho_da_rainha -> {
                showAlertDialog("Frango à Passarinho da Rainha",
                    "O Frango à Passarinho da Rainha é um prato supremo de frango, meticulosamente frito em pedaços e salteado no alho e no autêntico molho shoyu. É graciosamente acompanhado de um arroz branco bem soltinho, batatas fritas crocantes, farofa saborosa e um vinagrete fresco e vibrante. Este prato é uma celebração corajosa da vida, um convite para enfrentar os desafios de frente, saboreando cada pedacinho. É a perfeita combinação de sabores que promete ultrapassar qualquer expectativa.")
            }
            R.id.img_peixe_a_dore_com_molho_tartaro, R.id.txt_peixe_a_dore_com_molho_tartaro -> {
                showAlertDialog("Peixe à dore com molho tártaro",
                    "Peixe à dorê é uma receita conhecida da maioria dos brasileiros. O nome pode mudar de acordo com a região, mas quem não adora um peixe empanado com molho tártaro?")
            }
            R.id.img_peixe_empanado_com_molho_tartaro, R.id.txt_peixe_empanado_com_molho_tartaro -> {
                showAlertDialog("Peixe empanado com molho tártaro",
                    "O molho tártaro é a companhia certa para servir esse peixe empanado delicioso e atingir aquele sabor que você já ouviu falar ou até experimentou.")
            }
        }
    }

    private fun showAlertDialog(title: String, description: String){
        // Create the AlertDialog
        val builder = this.context.let { it1 -> AlertDialog.Builder(it1!!)  }
        val dialog: View = LayoutInflater.from(this.context).inflate(
            R.layout.dialog_layout,
            (this.context?.let { RelativeLayout(it) })!!.findViewById(R.id.layoutDialogContainer)
        );
        builder.setView(dialog)    // Adiciona o Dialog Layout no builder

        val dialogTitle = dialog.findViewById<TextView>(R.id.dialogTitle)
        val dialogMessage = dialog.findViewById<TextView>(R.id.textMessage)
        dialogTitle.text = title
        dialogMessage.text = description

        val alertDialog = builder.create()
        dialog.findViewById<Button>(R.id.dialogBtnOk).setOnClickListener {
            alertDialog.dismiss()      // Fecha a caixa de diálogo com o botão OK
        }
        alertDialog.setCancelable(true)                           // Set other dialog properties
        alertDialog.show()
    }
}