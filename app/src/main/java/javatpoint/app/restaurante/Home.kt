package javatpoint.app.restaurante

import android.animation.Animator
import android.animation.AnimatorInflater
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.animation.doOnEnd
import androidx.fragment.app.Fragment

class Home: Fragment()  {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.home_layout, container, false)

        val delay:Long = 3000  // Tipo Long é obrigatório
        val trianguloImg1:ImageView = view.findViewById(R.id.triangulo1)
        val trianguloImg2:ImageView = view.findViewById(R.id.triangulo2)
        val trianguloImg3:ImageView = view.findViewById(R.id.triangulo3)

        // Cria duas animações FadeIn e FadeOut para cada imagem
        val img1FadeIn: Animator = AnimatorInflater.loadAnimator(context, R.animator.fade_in)
            .apply {
                setTarget(trianguloImg1)  // Animação de alpha para o logo
            }
        val img2FadeIn: Animator = AnimatorInflater.loadAnimator(context, R.animator.fade_in)
            .apply {
                setTarget(trianguloImg2)  // Animação de alpha para o logo
            }
        val img3FadeIn: Animator = AnimatorInflater.loadAnimator(context, R.animator.fade_in)
            .apply {
                setTarget(trianguloImg3)  // Animação de alpha para o logo
            }
        val img1FadeOut: Animator = AnimatorInflater.loadAnimator(context, R.animator.fade_out)
            .apply {
                setTarget(trianguloImg1)  // Animação de alpha para o logo
            }
        val img2FadeOut: Animator = AnimatorInflater.loadAnimator(context, R.animator.fade_out)
            .apply {
                setTarget(trianguloImg2)  // Animação de alpha para o logo
            }
        val img3FadeOut: Animator = AnimatorInflater.loadAnimator(context, R.animator.fade_out)
            .apply {
                setTarget(trianguloImg3)  // Animação de alpha para o logo
            }

        trianguloImg2.alpha = 0.0F   // Deixa a segunda imagem invisível antes de começar a animação
        trianguloImg3.alpha = 0.0F

        // Alterna entre as animações para cada imagem
        img1FadeIn.doOnEnd { img3FadeOut.start() }
        img1FadeOut.doOnEnd { img1FadeIn.start() }
        img2FadeIn.doOnEnd { img1FadeOut.start() }
        img2FadeOut.doOnEnd { img2FadeIn.start() }
        img3FadeIn.doOnEnd { img2FadeOut.start() }
        img3FadeOut.doOnEnd { img3FadeIn.start() }

        // Delay para o início da animação
        Handler(Looper.getMainLooper()).postDelayed({
            img1FadeIn.start()
            img2FadeOut.start()
                                                    }, delay)

        return view
    }
}