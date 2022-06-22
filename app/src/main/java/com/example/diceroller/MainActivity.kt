package com.example.diceroller

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView


/*
 This allows the user to roll a dice and view the results on screen
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        This sets the button as a button and lets it be used.
         */

        val rollButton: Button = findViewById(R.id.rollButton)
        rollButton.setOnClickListener { rollDice() } // Generates the acitivity on the roll.
    }

    /*
        This creates the dice, rolls it and places the results into a textView
     */
    private fun rollDice() {

        val dice = Dice(6) //Creates a dice D6.
        val diceRoll = dice.roll() //Rolls a dice.
        val diceImage: ImageView = findViewById(R.id.imageView) //Sets up a Image for the result.
        // Determines what to show when what outcome the dice has.
        when (diceRoll) {
            1 -> diceImage.setImageResource(R.drawable.dice_1)
            2 -> diceImage.setImageResource(R.drawable.dice_2)
            3 -> diceImage.setImageResource(R.drawable.dice_3)
            4 -> diceImage.setImageResource(R.drawable.dice_4)
            5 -> diceImage.setImageResource(R.drawable.dice_5)
            else -> diceImage.setImageResource(R.drawable.dice_6)
        }
    }
}

class Dice(val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}