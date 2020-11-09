package com.juliane.biscoitim

import android.app.Dialog
import android.content.Context
import android.content.DialogInterface
import kotlin.random.Random
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Criando lista de frases
        val sorte = arrayListOf(
            "A vida lhe trará coisas boas mas não em 2020.",
            "Tente respirar fundo mais vezes, ninguém aguenta mais esse ano.",
            "Não posso te ajudar, sou apenas uma frase de um biscoito.",
            "Aquele que ronca mais alto dorme primeiro.",
            "Você ja e adulto e ainda espera algo de um biscoito?",
            "Ignore o biscoito anterior.",
            "Error 404: Fortune not found.",
            "Para realmente se encontrar você deve brincar de esconde-esconde sozinho.",
            "A sorte que você procura esta em outro biscoito.",
            "Se distancie de pessoas que acreditam na sorte do biscoito.",
            "Vejo dinheiro no seu futuro mas não é seu.",
            "Uma pessoa tola ouve seu coração a sábia ouve seu biscoito.",
            "Pare de procrastinar, comece amanhã.",
            "Não se preocupe, tudo ficará bem, algum dia, talvez…")

        /*Executar (escutando) o clique do botao Cookie
        btnCookie.setOnClickListener {*/

            //Pegar a referencia da ImageView
            val image_view = findViewById(R.id.imgCookie) as ImageView
            //Fazer a imagem ser clicavel (escutar o clique)
            image_view.setOnClickListener {


                //Criar caixa de dialogo com a sorte
                AlertDialog.Builder(this)
                .setTitle("Sorte!")
                //Retorna uma mensagem randomica
                .setMessage(sorte.random())
                .setPositiveButton("Ok") { _, _ -> }
                .create()
                .show()
            }

        }
    }


