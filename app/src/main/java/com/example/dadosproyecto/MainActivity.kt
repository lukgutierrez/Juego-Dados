package com.example.dadosproyecto

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var  imagenDado : ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val tocBotton : Button = findViewById(R.id.tocbotton)
        tocBotton.text = getString(R.string.app_name)
        tocBotton.setOnClickListener{
            lanzarDado()
        }

        imagenDado = findViewById(R.id.imagendado)


    }

   private fun lanzarDado() {
        val randomInt = java.util.Random().nextInt(6)+1
        val drawableResource = when (randomInt) {
            1 -> R.drawable.one
            2 -> R.drawable.two
            3 -> R.drawable.three
            4 -> R.drawable.fuor
            5 -> R.drawable.five
            else -> R.drawable.six
        }
    imagenDado.setImageResource(drawableResource)
    }




}