package com.example.testapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Finalviewpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finalviewpage)

        val eightActButton = findViewById<Button>(R.id.button8)
        eightActButton.setOnClickListener {
            val Intent = Intent(this@Finalviewpage, Questionpage1::class.java)
            startActivity(Intent)
        }

        val nightActButton = findViewById<Button>(R.id.button9)
        nightActButton.setOnClickListener {
            val Intent = Intent(this@Finalviewpage, MainActivity::class.java)
            startActivity(Intent)
        }
    }
}