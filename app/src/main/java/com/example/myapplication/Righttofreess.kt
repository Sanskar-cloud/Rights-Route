package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Righttofreess : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_righttofreess)

        val button = findViewById<Button>(R.id.btneql2)
        button.setOnClickListener{
            val intent = Intent(this, Righttofrees2::class.java)
            startActivity(intent)
        }
    }
}