package com.example.nike

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class fignya : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fignya)
    }

    fun login(view: View){
        val intent = Intent(  this,fignya2::class.java)
        startActivity(intent)}
    }
