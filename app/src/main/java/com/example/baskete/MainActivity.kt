package com.example.baskete

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var pontuacaoTimeA: Int = 0

    lateinit var placarTimeATextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tresPontosAButton: Button = findViewById(R.id.tresPontosAButton)
        tresPontosAButton.setOnClickListener(View.OnClickListener { addTresPontosTimeA() })

        val doisPontosAButton: Button = findViewById(R.id.doisPontosAButton)
        doisPontosAButton.setOnClickListener(View.OnClickListener { addDoisPontosTimeA() })

        val tiroLivreAButton: Button = findViewById(R.id.tiroLivreAButton)
        tiroLivreAButton.setOnClickListener(View.OnClickListener { addTiroLivreTimeA() })
    }

    fun mostrarPlacarTimeA (pontuacao: Int) {
        this.placarTimeATextView = findViewById(R.id.placarTimeATextView)
        placarTimeATextView.setText(pontuacao.toString())
    }

    fun addTresPontosTimeA() {
        pontuacaoTimeA = pontuacaoTimeA + 3
        mostrarPlacarTimeA(pontuacaoTimeA)
    }
    fun addDoisPontosTimeA() {
       pontuacaoTimeA = pontuacaoTimeA + 2
        mostrarPlacarTimeA(pontuacaoTimeA)
    }
    fun addTiroLivreTimeA() {
        pontuacaoTimeA = pontuacaoTimeA + 1
        mostrarPlacarTimeA(pontuacaoTimeA)
    }
}
