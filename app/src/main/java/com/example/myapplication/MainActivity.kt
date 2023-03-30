package com.example.myapplication

import android.content.Intent
import android.content.res.Configuration
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.firebase.auth.FirebaseAuth
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var firebaseAuth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actionBar = supportActionBar
        actionBar?.setBackgroundDrawable(ColorDrawable(ContextCompat.getColor(this, R.color.nav_color)))



        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        bottomNavigationView.selectedItemId = R.id.home
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.location -> {
                    startActivity(Intent(applicationContext, MapsActivity::class.java))
                    overridePendingTransition(0, 0)
                    true
                }
                R.id.vote -> {
                    startActivity(Intent(applicationContext, RightToVote::class.java))
                    overridePendingTransition(0, 0)
                    true
                }
                R.id.home -> true

                R.id.violation -> {
                    startActivity(Intent(applicationContext, Voilation::class.java))
                    overridePendingTransition(0, 0)
                    true
                }
                R.id.home -> {
                    startActivity(Intent(applicationContext, MainActivity::class.java))
                    overridePendingTransition(0, 0)
                    true
                }
                R.id.news -> {
                    startActivity(Intent(applicationContext, news::class.java))
                    overridePendingTransition(0, 0)
                    true

                }
                R.id.setting-> {
                    startActivity(Intent(applicationContext,EditProfilePage::class.java))
                    overridePendingTransition(0, 0)
                    true

                }
                else -> false
            }
        }




    firebaseAuth = FirebaseAuth.getInstance()


        val cardView = findViewById<CardView>(R.id.card1)
        cardView.setOnClickListener {
            val intent = Intent(this, RighttoEquality1::class.java)
            startActivity(intent)
        }

        val cardView2 = findViewById<CardView>(R.id.card2)
        cardView2.setOnClickListener {
            val intent = Intent(this, RightTofreedom2::class.java)
            startActivity(intent)
        }

        val cardView3 = findViewById<CardView>(R.id.card3)
        cardView3.setOnClickListener {
            val intent = Intent(this, Righttoexpolio::class.java)
            startActivity(intent)
        }
        val cardView4 = findViewById<CardView>(R.id.card4)
        cardView4.setOnClickListener {
            val intent = Intent(this, Righttofreess::class.java)
            startActivity(intent)
        }
        val cardView5 = findViewById<CardView>(R.id.card5)
        cardView5.setOnClickListener {
            val intent = Intent(this, Rightreligion1::class.java)
            startActivity(intent)
        }
        val cardView6 = findViewById<CardView>(R.id.card6)
        cardView6.setOnClickListener {
            val intent = Intent(this, Rightconsremedy1::class.java)
            startActivity(intent)
        }


    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)

        return true
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {

            R.id.news-> {
                val intent = Intent(this, news::class.java)
                startActivity(intent)
                return true


            }
            else -> return super.onOptionsItemSelected(item)
        }

        fun setLocale(languageCode: String) {
            val locale = Locale(languageCode)
            Locale.setDefault(locale)
            val resources = applicationContext.resources
            val config = Configuration(resources.configuration)
            config.setLocale(locale)
            resources.updateConfiguration(config, resources.displayMetrics)
        }




    }

}











