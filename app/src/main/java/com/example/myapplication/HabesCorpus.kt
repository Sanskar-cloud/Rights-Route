package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class HabesCorpus : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_habes_corpus)

        val button = findViewById<Button>(R.id.htf)
        button.setOnClickListener{
            val intent = Intent(this, hvedio::class.java)
            startActivity(intent)
        }



    }
}

        

