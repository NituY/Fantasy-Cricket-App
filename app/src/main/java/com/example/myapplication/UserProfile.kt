package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class UserProfile : AppCompatActivity() {
    
    private lateinit var  camView:ImageView
    private lateinit var profile: ImageView
    private lateinit var wallet: ImageView
    private lateinit var dashBoard: ImageView
    private lateinit var settngs: ImageView
    private lateinit var updat :Button
    companion object{
        val image_request_code = 100
    }
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_profile)

        camView = findViewById(R.id.camIV)
        profile = findViewById(R.id.pImV)
        wallet = findViewById(R.id.walletIMV)
        dashBoard = findViewById(R.id.dashIMV)
        settngs = findViewById(R.id.settingIMV)
        updat = findViewById(R.id.updateBtn)

        wallet.setOnClickListener {
            val wallIntent = Intent(this,Wallet::class.java)
            startActivity(wallIntent)
        }
        dashBoard.setOnClickListener {
            val dashIntent = Intent(this,DashBoard::class.java)
            startActivity(dashIntent)
        }
        settngs.setOnClickListener {
            val setIntent = Intent(this,Settings::class.java)
            startActivity(setIntent)
        }
        updat.setOnClickListener {
            val updateIntent = Intent(this,MainActivity2::class.java)
            startActivity(updateIntent)
        }
        
        camView.setOnClickListener {
            pickImageGallery()
        }

    }

    private fun pickImageGallery() {
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"
        startActivityForResult(intent, image_request_code)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode== image_request_code && resultCode == RESULT_OK){
            profile.setImageURI(data?.data)
        }
    }
}