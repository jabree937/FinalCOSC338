package com.example.realfinal338


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstButton = findViewById<Button>(R.id.FirstButton)
        firstButton.setOnClickListener {
            val Intent = Intent(this, MainActivity2::class.java)
            startActivity(Intent)
        }

        val secondButton = findViewById<Button>(R.id.SecondButton)
        secondButton.setOnClickListener {
            val Intent = Intent(this, MainActivity2::class.java)
            startActivity(Intent)
        }

    }
}