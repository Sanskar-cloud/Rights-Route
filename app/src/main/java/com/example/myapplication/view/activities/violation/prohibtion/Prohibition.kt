package com.example.myapplication.view.activities.violation.prohibtion

import android.content.Intent
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.content.ContextCompat
import com.example.myapplication.R
import com.example.myapplication.view.activities.violation.HabeasCorpus.hvedio

class Prohibition : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prohibition)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val actionBar = supportActionBar
        actionBar?.setBackgroundDrawable(ColorDrawable(ContextCompat.getColor(this,
            R.color.nav_color
        )))

        val button = findViewById<Button>(R.id.buttonhvd)
        button.setOnClickListener{
            val intent = Intent(this, hvedio::class.java)
            startActivity(intent)
        }

    }
}