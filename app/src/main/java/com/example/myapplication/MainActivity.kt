package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val backImage = findViewById<ImageView>(R.id.imageView)
        val toAnim = AnimationUtils.loadAnimation(this,R.anim.top_anim)
        val botAnime = AnimationUtils.loadAnimation(this, R.anim.bottom_anim)
        val textAnim = findViewById<TextView>(R.id.appname)
        backImage.startAnimation(toAnim)
        textAnim.startAnimation(botAnime)

        Handler().postDelayed({
            startActivity(Intent(this, MainActivity2::class.java))
            finish()
        },3000)
    }
}


