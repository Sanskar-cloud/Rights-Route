package com.example.myapplication

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class Mandveedio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hvedio)


        val videoView = findViewById<VideoView>(R.id.videoView)

        val youtubeVideoUrl = "https://www.youtube.com/watch?v=e7AAEvf8uhA"
        videoView.setVideoURI(Uri.parse(youtubeVideoUrl))



        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        videoView.setMediaController(mediaController)

        videoView.start()



    }
}