package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class User_Login : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_login)
        val sBtn = findViewById<Button>(R.id.submitBtn)
        sBtn.setOnClickListener {
            val subIntent = Intent(this,UserProfile::class.java)
            startActivity(subIntent)
        }
    }
}