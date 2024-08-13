package com.example.numberguessing

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val guessBtn = findViewById<Button>(R.id.guessBtn)
        val numberInput = findViewById<TextInputEditText>(R.id.numberInput)
        val randomNumber = findViewById<TextView>(R.id.randomNumber)
        var correctWrong = findViewById<TextView>(R.id.CorrectOrWrong)

        guessBtn.setOnClickListener{
            var randNum = Random.nextInt(1, 100)

            randomNumber.text = randNum.toString()
        }
        }
    }