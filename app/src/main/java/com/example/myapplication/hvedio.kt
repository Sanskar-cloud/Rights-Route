package com.example.myapplication

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class hvedio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hvedio)


        val videoView1 = findViewById<VideoView>(R.id.video_view_1)

        videoView1.setVideoURI(Uri.parse("https://www.youtube.com/watch?v=K2sFjCEYMB0"))

        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView1)
        videoView1.setMediaController(mediaController)

        videoView1.start()

        val videoView2 = findViewById<VideoView>(R.id.video_view_2)

        val youtubeVideoUrl2 = "https://www.youtube.com/watch?v=duxLMyipJ9c&t"
        videoView2.setVideoURI(Uri.parse(youtubeVideoUrl2))



        val mediaController2 = MediaController(this)
        mediaController2.setAnchorView(videoView2)
        videoView2.setMediaController(mediaController)

        videoView2.start()



    }
}