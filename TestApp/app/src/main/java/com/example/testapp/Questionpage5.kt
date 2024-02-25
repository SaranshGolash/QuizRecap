package com.example.testapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Questionpage5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questionpage5)

        val seventhActButton = findViewById<Button>(R.id.button7)
        seventhActButton.setOnClickListener {
            val Intent = Intent(this@Questionpage5, Finalviewpage::class.java)
            startActivity(Intent)
        }
    }
}