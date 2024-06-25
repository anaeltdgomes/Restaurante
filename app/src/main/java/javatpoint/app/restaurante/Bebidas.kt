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

class Bebidas: Fragment(), View.OnClickListener  {
    override fun onCreateView(        // View initialization logic
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        // Inflate the layout for this fragment
        val mostrar: View = inflater.inflate(R.layout.bebidas_layout, container, false)

        mostrar.findViewById<ImageView>(R.id.img_agua_1_5l)?.setOnClickListener(this)
        mostrar.findViewById<TextView>(R.id.txt_agua_1_5l)?.setOnClickListener(this)
        mostrar.findViewById<ImageView>(R.id.img_agua_500ml)?.setOnClickListener(this)
        mostrar.findViewById<TextView>(R.id.txt_agua_500ml)?.setOnClickListener(this)
        mostrar.findViewById<ImageView>(R.id.img_cerveja_brahma_lata)?.setOnClickListener(this)
        mostrar.findViewById<TextView>(R.id.txt_cerveja_brahma_lata)?.setOnClickListener(this)
        mostrar.findViewById<ImageView>(R.id.img_cerveja_chopp_lata)?.setOnClickListener(this)
        mostrar.findViewById<TextView>(R.id.txt_cerveja_chopp_lata)?.setOnClickListener(this)
        mostrar.findViewById<ImageView>(R.id.img_cerveja_corona_long_neck)?.setOnClickListener(this)
        mostrar.findViewById<TextView>(R.id.txt_cerveja_corona_long_neck)?.setOnClickListener(this)
        mostrar.findViewById<ImageView>(R.id.img_cerveja_extra_corona)?.setOnClickListener(this)
        mostrar.findViewById<TextView>(R.id.txt_cerveja_extra_corona)?.setOnClickListener(this)
        mostrar.findViewById<ImageView>(R.id.img_cerveja_heineken_lata)?.setOnClickListener(this)
        mostrar.findViewById<TextView>(R.id.txt_cerveja_heineken_lata)?.setOnClickListener(this)
        mostrar.findViewById<ImageView>(R.id.img_cerveja_heineken_puro_malte)?.setOnClickListener(this)
        mostrar.findViewById<TextView>(R.id.txt_cerveja_heineken_puro_malte)?.setOnClickListener(this)
        mostrar.findViewById<ImageView>(R.id.img_guarana_antartica)?.setOnClickListener(this)
        mostrar.findViewById<TextView>(R.id.txt_guarana_antartica)?.setOnClickListener(this)
        mostrar.findViewById<ImageView>(R.id.img_h2oh_limao)?.setOnClickListener(this)
        mostrar.findViewById<TextView>(R.id.txt_h2oh_limao)?.setOnClickListener(this)
        mostrar.findViewById<ImageView>(R.id.img_refrigerante_pepsi_pet)?.setOnClickListener(this)
        mostrar.findViewById<TextView>(R.id.txt_refrigerante_pepsi_pet)?.setOnClickListener(this)
        mostrar.findViewById<ImageView>(R.id.img_refrigerante_sem_acucar_coca_cola)?.setOnClickListener(this)
        mostrar.findViewById<TextView>(R.id.txt_refrigerante_sem_acucar_coca_cola)?.setOnClickListener(this)

        return mostrar
    }

    override fun onClick(view: View){
         when (view.id) {
            R.id.img_agua_1_5l, R.id.txt_agua_1_5l -> {
                showAlertDialog("Água Mineral com Gás Crystal 1,5L",
                "A Água Mineral com Gás Crystal 1,5L é uma opção refrescante e gaseificada para hidratação. Com sua composição de água mineral com gás, ela proporciona uma sensação de frescor e leveza. Sua embalagem de 1,5L é ideal para compartilhar em momentos de refeições ou para uso individual ao longo do dia.")
            }
             R.id.img_agua_500ml, R.id.txt_agua_500ml -> {
                 showAlertDialog("Água Mineral com Gás Prata 510ml",
                     "A Água Mineral com Gás Prata 510ml é uma opção refrescante e borbulhante para os momentos de sede. Com sua composição de água mineral com gás, ela proporciona uma sensação de frescor e leveza. Sua embalagem de 510ml é ideal para levar para passeios, viagens ou consumir em casa.")
             }
             R.id.img_cerveja_brahma_lata, R.id.txt_cerveja_brahma_lata -> {
                 showAlertDialog("Cerveja Brahma Duplo Malte 350ml Lata",
                     "A cerveja Duplo Malte da Brahma é uma bebida refrescante e encorpada, com sabor e aroma equilibrados e marcantes. Elaborada com maltes selecionados e uma combinação perfeita de ingredientes, é ideal para quem aprecia cervejas mais encorpadas e com um toque mais intenso. A embalagem em lata de 350ml é prática e fácil de levar para qualquer lugar, perfeita para compartilhar com amigos em momentos descontraídos. Experimente a qualidade Brahma em uma cerveja que vai te surpreender.")
             }
             R.id.img_cerveja_chopp_lata, R.id.txt_cerveja_chopp_lata -> {
                 showAlertDialog("Cerveja Chopp Brahma 350ml Lata",
                     "Cerveja Pilsen Brahma Chopp Lata 350ml é mais leve, com paladar clássico da baixa fermentação e tem sabor encorpado, aroma neutro, amargor menos acentuado e médio teor alcoólico.")
             }
             R.id.img_cerveja_corona_long_neck, R.id.txt_cerveja_corona_long_neck -> {
                 showAlertDialog("Cerveja Corona Pilsen 330ml Long Neck",
                     "A Cerveja Pilsen Long Neck Corona 330ml é uma cerveja premium de origem mexicana, conhecida por seu sabor suave e refrescante. Com uma graduação alcoólica de 4,6%, a Corona é uma cerveja leve e fácil de beber, ideal para ser consumida em momentos de descontração e lazer, seja em casa ou em bares e restaurantes. A garrafa long neck de 330ml é ideal para quem deseja uma quantidade menor de cerveja ou para ser compartilhada com amigos e familiares. Além disso, a Corona é uma marca reconhecida mundialmente e possui um visual icônico, com rótulo e garrafa que remetem às praias do México. Aproveite agora essa deliciosa opção e desfrute de uma cerveja premium que é sinônimo de qualidade e sabor!")
             }
             R.id.img_cerveja_extra_corona, R.id.txt_cerveja_extra_corona -> {
                 showAlertDialog("Cerveja Extra Corona 350ml Lata",
                     "A Cerveja Extra Corona 350ml é uma opção clássica e reconhecida mundialmente, conhecida pelo seu sabor refrescante e qualidade premium. Originária do México, a Corona Extra é uma cerveja tipo Lager que se destaca por sua leveza e paladar equilibrado. É uma escolha popular em diversas ocasiões e frequentemente associada a momentos descontraídos e de lazer.")
             }
             R.id.img_cerveja_heineken_lata, R.id.txt_cerveja_heineken_lata -> {
                 showAlertDialog("Cerveja Heineken 350ml Lata",
                     "Uma das bebidas preferidas no nosso país e que não pode faltar em festas, churrascos e confraternizações é a cerveja. Para animar as celebrações, a Heineken apresenta a Cerveja Premium Puro Malte Lager Heineken Lata 350ml, uma cerveja refrescante produzida com ingredientes 100% naturais. Ela possui coloração amarelo dourado e é fabricada em tanques horizontais para garantir mais sabor e consistência. A exclusiva levedura A acrescentada durante a fermentação traz um sabor equilibrado com notas frutadas e sutis. Na clássica versão em lata a cerveja Heineken está ainda mais refrescante e gela bem rápido.")
             }
             R.id.img_cerveja_heineken_puro_malte, R.id.txt_cerveja_heineken_puro_malte -> {
                 showAlertDialog("Cerveja Heineken Puro Malte 330ml Long Neck",
                     "A cerveja Puro Malte Heineken Long Neck 330ml é uma bebida de alta qualidade e sabor inconfundível, produzida com ingredientes selecionados e processos de fabricação cuidadosamente controlados para garantir um resultado excepcional. Com sua cor dourada e espuma cremosa, essa cerveja é perfeita para quem aprecia uma bebida refrescante e de personalidade marcante. Seu aroma é delicado e equilibrado, com notas sutis de lúpulo e malte. Ideal para compartilhar com amigos em momentos de descontração ou para acompanhar refeições especiais.")
             }
             R.id.img_guarana_antartica, R.id.txt_guarana_antartica -> {
                 showAlertDialog("Guaraná Antártica 350ml",
                     "Refrigerante brasileiro com sabor único e natural, feito do fruto do guaraná plantado e colhido na Amazônia.")
             }
             R.id.img_h2oh_limao, R.id.txt_h2oh_limao -> {
                 showAlertDialog("H2OH Limão 500ml",
                     "Bebida levemente gaseificada, com zero de açúcar, fonte de vitaminas B e suco natural de limão.")
             }
             R.id.img_refrigerante_pepsi_pet, R.id.txt_refrigerante_pepsi_pet -> {
                 showAlertDialog("Refrigerante Pepsi Pet 200ml",
                     "O refrigerante Pepsi é uma das bebidas mais populares e consumidas em todo o mundo, conhecido pelo seu sabor único e refrescante. Com sua embalagem em PET de 200ml, é uma opção prática e conveniente para ser consumido em qualquer lugar. A Pepsi é produzida com ingredientes selecionados e de alta qualidade, como açúcar refinado, água gaseificada, corantes e aromatizantes naturais. Possui um sabor equilibrado entre doce e ácido, que agrada a diferentes paladares e combina perfeitamente com diversas ocasiões e pratos. O refrigerante Pepsi de 200ml é ideal para ser consumido sozinho ou acompanhado de petiscos, lanches e refeições. Seu tamanho compacto permite levar em mochilas, bolsas e até mesmo no bolso, para desfrutar em qualquer lugar. Experimente o refrigerante Pepsi em sua embalagem PET de 200ml e desfrute de um sabor refrescante e inconfundível.")
             }
             R.id.img_refrigerante_sem_acucar_coca_cola, R.id.txt_refrigerante_sem_acucar_coca_cola -> {
                 showAlertDialog("Refrigerante sem Açúcar Coca-Cola Garrafa 200ml",
                     "O Refrigerante Sem Açúcar Coca-Cola Garrafa 200ml é a escolha perfeita para quem busca uma bebida refrescante e saborosa, mas que deseja reduzir a ingestão de açúcar. Com zero açúcar e baixas calorias, esse refrigerante apresenta o sabor inconfundível da Coca-Cola, combinando notas de caramelo, baunilha e limão. A garrafa de 200ml é prática e fácil de carregar, sendo uma excelente opção para acompanhar refeições fora de casa ou para ser apreciada em momentos de lazer. Além disso, a Coca-Cola é uma marca reconhecida mundialmente pela qualidade e tradição em suas bebidas, garantindo uma experiência única aos seus consumidores. Aproveite o sabor da Coca-Cola sem culpa com o Refrigerante Sem Açúcar Coca-Cola Garrafa 200ml.")
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
            alertDialog.dismiss()              // Fecha a caixa de diálogo com o botão OK
        }
        alertDialog.setCancelable(true)        // Fecha a caixa ao clicar fora dela
        alertDialog.show()
    }
}
