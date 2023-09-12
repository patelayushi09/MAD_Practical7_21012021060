package com.example.mad_practical7_21012021060

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    lateinit var vv:VideoView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         vv=findViewById(R.id.videoView)
        val btn:FloatingActionButton=findViewById(R.id.btn1)

        btn.setOnClickListener {
            Intent(this@MainActivity,YoutubeActivity::class.java).also {
                startActivity(it)
            }
        }
        initVideoPlayer()
    }

    fun initVideoPlayer(){
        val mediaController=MediaController(this)
        val uri: Uri =Uri.parse("android.resource://"+packageName+"/"+R.raw.thestoryoflight)
        vv.setMediaController(mediaController)
        mediaController.setAnchorView(vv)
        vv.setVideoURI(uri)
        vv.requestFocus()
        vv.start()

    }
}