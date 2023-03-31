package com.example.myapplication

import android.content.Intent
import android.graphics.drawable.ColorDrawable
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.squareup.picasso.Picasso

class NewsDetailActivity : AppCompatActivity() {

    private lateinit var title: String
    private lateinit var content: String
    private lateinit var desc: String
    private lateinit var imageURL: String
    private lateinit var url: String
    private lateinit var Title: TextView
    private lateinit var Content: TextView
    private lateinit var subdesc: TextView
    private lateinit var newsIV: ImageView
    private lateinit var newsbtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_newsdetail)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val actionBar = supportActionBar
        actionBar?.setBackgroundDrawable(ColorDrawable(ContextCompat.getColor(this, R.color.nav_color)))

        title = intent.getStringExtra("Title").toString()
        content = intent.getStringExtra("Content").toString()
        desc = intent.getStringExtra("Desc").toString()
        imageURL = intent.getStringExtra("Image").toString()
        url = intent.getStringExtra("Url").toString()

        Title = findViewById(R.id.TVTitle)
        Content = findViewById(R.id.Content)
        subdesc = findViewById(R.id.Subdesc)
        newsIV = findViewById(R.id.idIVNews)
        newsbtn = findViewById(R.id.btnnews)

        Title.text = title
        Content.text = content
        subdesc.text = desc
        Picasso.get().load(imageURL).into(newsIV)


        val button = findViewById<Button>(R.id.btnnews)
        button.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

    }


}