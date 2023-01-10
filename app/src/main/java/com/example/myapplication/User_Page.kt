package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class User_Page : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_page)
        val uButton = findViewById<Button>(R.id.submitBtn)
        val loginButton = findViewById<TextView>(R.id.loginTv)
        uButton.setOnClickListener {
            val submitIntent = Intent (this,UserProfile::class.java)
            startActivity(submitIntent)
        }
        loginButton.setOnClickListener {
            val loginIntent = Intent(this, User_Login::class.java)
            startActivity(loginIntent)

        }
    }
}