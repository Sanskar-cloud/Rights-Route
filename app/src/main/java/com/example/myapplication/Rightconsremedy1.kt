package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Rightconsremedy1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rightconsremedy1)

        val button = findViewById<Button>(R.id.buteql)
        button.setOnClickListener{
            val intent = Intent(this, Righttooconsremedy2::class.java)
            startActivity(intent)
        }
    }
}