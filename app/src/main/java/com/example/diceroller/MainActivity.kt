package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    //estudar sobre o funcionamento do lateinit

    lateinit var diceImage :  ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Deixando o botão com a ação de clicar
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
    }
    //Configurando o botão
    private fun  rollDice() {
        val randomInt = (1..6).random()

        val diceImage : ImageView = findViewById(R.id.dice_image)
        val drawableResource = when (randomInt) {

            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6

        }
        //Relacionando e inserindo imagens do dado
        diceImage.setImageResource(drawableResource)

        //metodo para aparecer a mensagem no aplicativo
        Toast.makeText(this, "button clicked",
        Toast.LENGTH_LONG).show()
    }
}
