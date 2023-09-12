package com.example.mad_practical7_21012021060

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class YoutubeActivity : AppCompatActivity() {
    lateinit var wv: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_youtube)

        wv=findViewById(R.id.webView)
        val button:FloatingActionButton=findViewById(R.id.btn2)
        button.setOnClickListener {
            Intent(this@YoutubeActivity,MainActivity::class.java).also {
                startActivity(it)
            }
        }
        initYoutubePlayer()
    }

    val youtubeId="fJn9B64Znrk"
    fun initYoutubePlayer(){
        val ws:WebSettings=wv.settings
        ws.javaScriptEnabled=true
        ws.loadWithOverviewMode=true
        ws.useWideViewPort=true
        wv.loadUrl("https://www.youtube.com/embed/$youtubeId")
    }
}