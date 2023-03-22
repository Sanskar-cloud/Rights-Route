package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Voilation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_voilation)


        val button = findViewById<Button>(R.id.btneql3)
        button.setOnClickListener{
            val intent = Intent(this, VoilationRules::class.java)
            startActivity(intent)
        }
    }
}