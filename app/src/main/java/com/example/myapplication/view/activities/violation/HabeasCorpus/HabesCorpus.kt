package com.example.myapplication.view.activities.violation.HabeasCorpus

import android.content.Intent
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.myapplication.R

class HabesCorpus : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_habes_corpus)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val actionBar = supportActionBar
        actionBar?.setBackgroundDrawable(ColorDrawable(ContextCompat.getColor(this,
            R.color.nav_color
        )))

        val button = findViewById<Button>(R.id.htf)
        button.setOnClickListener{
            val intent = Intent(this, hvedio::class.java)
            startActivity(intent)
        }



    }
}

        

