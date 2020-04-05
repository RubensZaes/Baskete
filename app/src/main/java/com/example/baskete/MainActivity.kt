package com.example.baskete

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var pontuacaoTimeA: Int = 0
    var pontuacaoTimeB: Int = 0

    lateinit var placarTimeATextView: TextView
    lateinit var placarTimeBTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tresPontosAButton: Button = findViewById(R.id.tresPontosAButton)
        tresPontosAButton.setOnClickListener(View.OnClickListener { addTresPontosTimeA() })

        val doisPontosAButton: Button = findViewById(R.id.doisPontosAButton)
        doisPontosAButton.setOnClickListener(View.OnClickListener { addDoisPontosTimeA() })

        val tiroLivreAButton: Button = findViewById(R.id.tiroLivreAButton)
        tiroLivreAButton.setOnClickListener(View.OnClickListener { addTiroLivreTimeA() })

        val tresPontosBButton: Button = findViewById(R.id.tresPontosBButton)
        tresPontosBButton.setOnClickListener(View.OnClickListener { addTresPontosTimeB() })

        val doisPontosBButton: Button = findViewById(R.id.doisPontosBButton)
        doisPontosBButton.setOnClickListener(View.OnClickListener { addDoisPontosTimeB() })

        val tiroLivreBButton: Button = findViewById(R.id.tiroLivreBButton)
        tiroLivreBButton.setOnClickListener(View.OnClickListener { addTiroLivreTimeB() })
    }

    fun mostrarPlacarTimeA (pontuacao: Int) {
        this.placarTimeATextView = findViewById(R.id.placarTimeATextView)
        placarTimeATextView.setText(pontuacao.toString())
    }

    private fun addTresPontosTimeA() {
        pontuacaoTimeA = pontuacaoTimeA + 3
        mostrarPlacarTimeA(pontuacaoTimeA)
    }

    private fun addDoisPontosTimeA() {
       pontuacaoTimeA = pontuacaoTimeA + 2
        mostrarPlacarTimeA(pontuacaoTimeA)
    }

    private fun addTiroLivreTimeA() {
        pontuacaoTimeA = pontuacaoTimeA + 1
        mostrarPlacarTimeA(pontuacaoTimeA)
    }

    fun mostrarPlacarTimeB (pontuacao: Int) {
        this.placarTimeBTextView = findViewById(R.id.placarTimeBTextView)
        placarTimeBTextView.setText(pontuacaoTimeB.toString())
    }

    private fun addTresPontosTimeB() {
        pontuacaoTimeB = pontuacaoTimeB + 3
        mostrarPlacarTimeB(pontuacaoTimeB)
    }

    private fun addDoisPontosTimeB() {
        pontuacaoTimeB = pontuacaoTimeB + 2
        mostrarPlacarTimeB(pontuacaoTimeB)
    }

    private fun addTiroLivreTimeB() {
        pontuacaoTimeB = pontuacaoTimeA + 1
        mostrarPlacarTimeB(pontuacaoTimeB)
    }
}
