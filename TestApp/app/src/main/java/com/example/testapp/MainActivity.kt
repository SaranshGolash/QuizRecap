package com.example.testapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstActButton = findViewById<Button>(R.id.button)
        firstActButton.setOnClickListener {
            val Intent = Intent(this@MainActivity, Rules::class.java)
            startActivity(Intent)
        }
    }
}