package com.example.myapplication

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class provedio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_provedio)

        val videoView = findViewById<VideoView>(R.id.video_view_1)

        val youtubeVideoUrl = "https://www.youtube.com/watch?v=xoUHuYNzHnI"
        videoView.setVideoURI(Uri.parse(youtubeVideoUrl))



        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        videoView.setMediaController(mediaController)

        videoView.start()


        val videoView2 = findViewById<VideoView>(R.id.video_view_2)

        val youtubeVideoUrl2 = "https://www.youtube.com/watch?v=YB4Zq92D9Fo"
        videoView2.setVideoURI(Uri.parse(youtubeVideoUrl2))



        val mediaController2 = MediaController(this)
        mediaController2.setAnchorView(videoView2)
        videoView2.setMediaController(mediaController)

        videoView2.start()
    }
}