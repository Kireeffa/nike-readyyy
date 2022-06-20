package com.example.nike

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.VideoView

class fignya3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fignya3)
val        simpleVideoView:VideoView = findViewById(R.id.videoView)
        simpleVideoView!!.setVideoURI(Uri.parse("android.resource://"
        +packageName + "/" + R.raw.video))

        simpleVideoView!!.start()
    }
}