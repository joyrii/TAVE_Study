package com.study.dice

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import com.study.dice.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val diceImage1 = binding.dice1
        val diceImage2 = binding.dice2

        binding.diceStartBtn.setOnClickListener {
            Toast.makeText(this, "데굴데굴", Toast.LENGTH_LONG).show()

            Log.d("MainActivity", Random.nextInt(1, 7).toString())
            Log.d("MainActivity", Random.nextInt(1, 7).toString())

            val number1 = Random.nextInt(1, 7)
            val number2 = Random.nextInt(1, 7)

            if (number1 == 1) {
                diceImage1.setImageResource(R.drawable.dice1)
            } else if (number1 == 2) {
                diceImage1.setImageResource(R.drawable.dice2)
            } else if (number1 == 3) {
                diceImage1.setImageResource(R.drawable.dice3)
            } else if (number1 == 4) {
                diceImage1.setImageResource(R.drawable.dice4)
            } else if (number1 == 5) {
                diceImage1.setImageResource(R.drawable.dice5)
            } else {
                diceImage1.setImageResource(R.drawable.dice6)
            }

            if (number2 == 1) {
                diceImage2.setImageResource(R.drawable.dice1)
            } else if (number2 == 2) {
                diceImage2.setImageResource(R.drawable.dice2)
            } else if (number2 == 3) {
                diceImage2.setImageResource(R.drawable.dice3)
            } else if (number2 == 4) {
                diceImage2.setImageResource(R.drawable.dice4)
            } else if (number2 == 5) {
                diceImage2.setImageResource(R.drawable.dice5)
            } else {
                diceImage2.setImageResource(R.drawable.dice6)
            }
        }

    }
}