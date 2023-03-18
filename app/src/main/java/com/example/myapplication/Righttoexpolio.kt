package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Righttoexpolio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_righttoexpolio)


        val button = findViewById<Button>(R.id.janoo)
        button.setOnClickListener{
            val intent = Intent(this, Righttoequality::class.java)
            startActivity(intent)
        }
    }
}