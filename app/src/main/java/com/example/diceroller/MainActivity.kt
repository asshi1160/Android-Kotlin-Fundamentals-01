package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        val resetButton: Button = findViewById(R.id.reset_button)
        val countUpButton: Button = findViewById(R.id.count_up_button)
        rollButton.setOnClickListener { rollDice() }
        resetButton.setOnClickListener { resetDice() }
        countUpButton.setOnClickListener { countUpDice() }
    }

    private fun rollDice() {
        val randomInt = (1..6).random()
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()
    }

    private fun resetDice() {
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = "0"
    }

    private fun countUpDice() {
        val resultText: TextView = findViewById(R.id.result_text)

        if (resultText.text == "Hello World!") {
            resultText.text = "1"
        } else if (resultText.text != "6") {
            resultText.text = (resultText.text.toString().toInt() + 1).toString()
        }
    }
}