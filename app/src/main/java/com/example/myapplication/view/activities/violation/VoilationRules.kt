package com.example.myapplication.view.activities.violation

import android.content.Intent
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import com.example.myapplication.R
import com.example.myapplication.view.activities.violation.Cretoria.cretoria
import com.example.myapplication.view.activities.violation.HabeasCorpus.HabesCorpus
import com.example.myapplication.view.activities.violation.Mandamus.Mandamus
import com.example.myapplication.view.activities.violation.QuoWarranto.quowarranto
import com.example.myapplication.view.activities.violation.prohibtion.Prohibition

class VoilationRules : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_voilation_rules)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val actionBar = supportActionBar
        actionBar?.setBackgroundDrawable(ColorDrawable(ContextCompat.getColor(this,
            R.color.nav_color
        )))

        val cardView = findViewById<CardView>(R.id.cardis1)
        cardView.setOnClickListener {
            val intent = Intent(this, HabesCorpus::class.java)
            startActivity(intent)
        }

        val cardView2 = findViewById<CardView>(R.id.cardis2)
        cardView2.setOnClickListener {
            val intent = Intent(this, Mandamus::class.java)
            startActivity(intent)
        }

        val cardView3 = findViewById<CardView>(R.id.cardis3)
        cardView3.setOnClickListener {
            val intent = Intent(this, cretoria::class.java)
            startActivity(intent)
        }
        val cardView4 = findViewById<CardView>(R.id.cardis4)
        cardView4.setOnClickListener {
            val intent = Intent(this, Prohibition::class.java)
            startActivity(intent)
        }
        val cardView5= findViewById<CardView>(R.id.cardis5)
        cardView5.setOnClickListener {
            val intent = Intent(this, quowarranto::class.java)
            startActivity(intent)
        }

    }
}