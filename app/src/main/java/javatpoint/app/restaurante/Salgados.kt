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

class Salgados: Fragment(), View.OnClickListener  {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val mostrar: View = inflater.inflate(R.layout.salgados_layout, container, false)

        mostrar.findViewById<ImageView>(R.id.img_batata_frita)?.setOnClickListener(this)
        mostrar.findViewById<TextView>(R.id.txt_batata_frita)?.setOnClickListener(this)
        mostrar.findViewById<ImageView>(R.id.img_cebola_frita_empanada)?.setOnClickListener(this)
        mostrar.findViewById<TextView>(R.id.txt_cebola_frita_empanada)?.setOnClickListener(this)
        mostrar.findViewById<ImageView>(R.id.img_combo_de_6_mini_esfihas_abertas)?.setOnClickListener(this)
        mostrar.findViewById<TextView>(R.id.txt_combo_de_6_mini_esfihas_abertas)?.setOnClickListener(this)
        mostrar.findViewById<ImageView>(R.id.img_combo_de_6_mini_kibes)?.setOnClickListener(this)
        mostrar.findViewById<TextView>(R.id.txt_combo_de_6_mini_kibes)?.setOnClickListener(this)
        mostrar.findViewById<ImageView>(R.id.img_esfiha_aberta_de_carne)?.setOnClickListener(this)
        mostrar.findViewById<TextView>(R.id.txt_esfiha_aberta_de_carne)?.setOnClickListener(this)
        mostrar.findViewById<ImageView>(R.id.img_esfiha_fechada_de_carne)?.setOnClickListener(this)
        mostrar.findViewById<TextView>(R.id.txt_esfiha_fechada_de_carne)?.setOnClickListener(this)
        mostrar.findViewById<ImageView>(R.id.img_esfiha_fechada_recheada_de_batata)?.setOnClickListener(this)
        mostrar.findViewById<TextView>(R.id.txt_esfiha_fechada_recheada_de_batata)?.setOnClickListener(this)
        mostrar.findViewById<ImageView>(R.id.img_esfiha_folhada_de_queijo)?.setOnClickListener(this)
        mostrar.findViewById<TextView>(R.id.txt_esfiha_folhada_de_queijo)?.setOnClickListener(this)
        mostrar.findViewById<ImageView>(R.id.img_kibe_frito_com_nozes)?.setOnClickListener(this)
        mostrar.findViewById<TextView>(R.id.txt_kibe_frito_com_nozes)?.setOnClickListener(this)
        mostrar.findViewById<ImageView>(R.id.img_kibe_frito)?.setOnClickListener(this)
        mostrar.findViewById<TextView>(R.id.txt_kibe_frito)?.setOnClickListener(this)

        return mostrar
    }

    override fun onClick(view: View){
        when (view.id) {
            R.id.img_batata_frita, R.id.txt_batata_frita -> {
                showAlertDialog("Batata frita",
                    "Batata frita super crocante, pronto para servir.")
            }
            R.id.img_cebola_frita_empanada, R.id.txt_cebola_frita_empanada -> {
                showAlertDialog("Cebola frita empanada",
                    "Cebola frita empanada super crocante, pronto para servir.")
            }
            R.id.img_combo_de_6_mini_esfihas_abertas, R.id.txt_combo_de_6_mini_esfihas_abertas -> {
                showAlertDialog("Combo de 6 mini esfihas abertas de carne ou de queijo",
                    "Super combo de sua escolha, esfihas abertas de carne ou queijo.")
            }
            R.id.img_combo_de_6_mini_kibes, R.id.txt_combo_de_6_mini_kibes -> {
                showAlertDialog("Combo de 6 mini kibes fritos",
                    "Super combo com 6 deliciosos kibes de carne.")
            }
            R.id.img_esfiha_aberta_de_carne, R.id.txt_esfiha_aberta_de_carne -> {
                showAlertDialog("Esfiha aberta de carne",
                    "Esfiha aberta de carne, cuidadosamente elaborada com ingredientes selecionados e receita tradicional, tem sabor e textura incríveis. Saborosa massa com delicioso recheio, ideal para servir como aperitivo, no lanche da tarde, ou a qualquer hora.")
            }
            R.id.img_esfiha_fechada_de_carne, R.id.txt_esfiha_fechada_de_carne -> {
                showAlertDialog("Esfiha fechada de carne",
                    "Esfiha fechada de carne, cuidadosamente elaborada com ingredientes selecionados e receita tradicional, tem sabor e textura incríveis. Saborosa massa com delicioso recheio, ideal para servir como aperitivo, no lanche da tarde, ou a qualquer hora.")
            }
            R.id.img_esfiha_fechada_recheada_de_batata, R.id.txt_esfiha_fechada_recheada_de_batata -> {
                showAlertDialog("Esfiha fechada recheada de batata",
                    "Esfiha fechada, cuidadosamente elaborada com ingredientes selecionados e receita tradicional, tem sabor e textura incríveis. Saborosa massa com delicioso recheio de batata, ideal para servir como aperitivo, no lanche da tarde, ou a qualquer hora.")
            }
            R.id.img_esfiha_folhada_de_queijo, R.id.txt_esfiha_folhada_de_queijo -> {
                showAlertDialog("Esfiha folhada de queijo",
                    "Esfiha Folhada de queijo para deixar qualquer um derretido. Agora feita com uma massa folhada perfeitamente saborosa, recheada com quatro queijos.")
            }
            R.id.img_kibe_frito_com_nozes, R.id.txt_kibe_frito_com_nozes -> {
                showAlertDialog("Kibe frito com nozes",
                    "Descubra o sabor exuberante do nosso Kibe Frito com Nozes. Esta delícia é cuidadosamente preparada com 120g de carne selecionada e recheada com nozes crocantes, seguindo a autêntica receita árabe.")
            }
            R.id.img_kibe_frito, R.id.txt_kibe_frito -> {
                showAlertDialog("Kibe frito",
                    "Carne moída temperada, trigo, cebola e folhas de hortelã.")
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