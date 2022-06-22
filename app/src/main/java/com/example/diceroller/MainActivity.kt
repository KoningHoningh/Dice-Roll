package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
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
        /*

         */
        var dice = Dice(6) //Creates a dice.
        var diceRoll = dice.roll() //Rolls a dice.
        var resultTextView: TextView = findViewById(R.id.textView) //Sets up a TextView for the result.
        resultTextView.text = diceRoll.toString() //Appends the results to the textView.

    }
}

class Dice(val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}