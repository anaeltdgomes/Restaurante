package javatpoint.app.restaurante

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.navigation.NavigationView

class SecondActivity:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        // Janela lateral que possui os itens de menu
        val drawerlayout: DrawerLayout? = findViewById(R.id.drawer_layout)
        val navigationView:NavigationView = findViewById(R.id.nav_view)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        val toggle = ActionBarDrawerToggle(this, drawerlayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)

        navigationView.itemIconTintList = null;  // Obrigatório! Impede que ícones fiquem pretos
        drawerlayout?.addDrawerListener(toggle)
        toggle.syncState()

        // Cada página é um Fragmento que é alternado pelo click do menu
        var fragment: Fragment = Home()
        val fm = supportFragmentManager
        var ft = fm.beginTransaction()
        ft.replace(R.id.frameLayout, fragment)
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
        ft.commit()            //  Carrega o frame principal

        val toolbar_txt:TextView = findViewById(R.id.toolbar_txt)
        var prevMenuItem: MenuItem? = null

        navigationView.setNavigationItemSelectedListener(NavigationView.OnNavigationItemSelectedListener {
            it.setVisible(false)            // Impossibilita que seja clicado duas vezes seguidas
            prevMenuItem?.setVisible(true)  // Torna visível o item anterior
            prevMenuItem = it

            when (it.title) {
                "Home" -> {
                    fragment = Home()
                    toolbar_txt.text="Restaurante TI"
                }
                "Carnes" -> {
                    fragment = Carnes()
                    toolbar_txt.text="Carnes"
                }
                "Salgados" -> {
                    fragment = Salgados()
                    toolbar_txt.text="Salgados"
                }
                "Bebidas" -> {
                    fragment = Bebidas()
                    toolbar_txt.text="Bebidas"
                }
                "Reserva" -> {
                    fragment = Reserva()
                    toolbar_txt.text="Reserva"
                }
                "Contato" -> {
                    fragment = Contato()
                    toolbar_txt.text="Contato"
                }
            }
            drawerlayout!!.closeDrawer(GravityCompat.START)

            ft = fm.beginTransaction()
            ft.replace(R.id.frameLayout, fragment)
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
            ft.commit()  //  Carrega o frame atual

            return@OnNavigationItemSelectedListener true
        });
        navigationView.bringToFront()     // Na frente dos outros objetos
    }

}