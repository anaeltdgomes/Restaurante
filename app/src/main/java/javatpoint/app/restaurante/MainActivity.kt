package javatpoint.app.restaurante

import android.content.ActivityNotFoundException
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView
import android.os.Handler
import android.content.Intent
import android.os.Looper
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.widget.TextView
import android.widget.Toast
import android.animation.Animator
import android.animation.AnimatorInflater

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var delay:Long = 1000                  // Tipo Long é obrigatório
        val textView:TextView = findViewById(R.id.restarante)
        val btnEntrar:Button = findViewById(R.id.btnEntar)
        val logoView:ImageView = findViewById(R.id.logo)
        val csbView:TextView = findViewById(R.id.csb)   // texto: Carnes - Salgados - Bebidas
        csbView.visibility = INVISIBLE

        val animate: Animator? = AnimatorInflater.loadAnimator(applicationContext, R.animator.fade_out)
            .apply {
                setTarget(logoView)  // Animação de alpha para o logo
            }

        Handler(Looper.getMainLooper()).postDelayed({ animate?.start() }, delay)
        delay +=delay
        Handler(Looper.getMainLooper()).postDelayed({ textView.setText("A") }, delay)
        delay += 200
        Handler(Looper.getMainLooper()).postDelayed({ textView.setText("RAN") }, delay)
        delay += 200
        Handler(Looper.getMainLooper()).postDelayed({ textView.setText("URANT") }, delay)
        delay += 200
        Handler(Looper.getMainLooper()).postDelayed({ textView.setText("AURANTE") }, delay)
        delay += 200
        Handler(Looper.getMainLooper()).postDelayed({ textView.setText("TAURANTE ") }, delay)
        delay += 200
        Handler(Looper.getMainLooper()).postDelayed({ textView.setText("STAURANTE  ") }, delay)
        delay += 200
        Handler(Looper.getMainLooper()).postDelayed({ textView.setText("ESTAURANTE  T") }, delay)
        delay += 200
        Handler(Looper.getMainLooper()).postDelayed({ textView.setText("RESTAURANTE  TI") }, delay)
        delay += 500
        Handler(Looper.getMainLooper()).postDelayed({ csbView.visibility = VISIBLE }, delay)

        // Muda a página para a SecondActivity
        btnEntrar.setOnClickListener {
            try{
                intent = Intent(this, SecondActivity::class.java)
                startActivity(intent)
            } catch (e: ActivityNotFoundException) {      // Mensagem de erro
                Toast.makeText(applicationContext, "Activity Error", Toast.LENGTH_SHORT).show()
            }
        }
    }
}