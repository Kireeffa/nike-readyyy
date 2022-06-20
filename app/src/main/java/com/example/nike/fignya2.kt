package com.example.nike

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class fignya2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fignya2)

    }

    fun singin(view: View) {
        var email: EditText = findViewById(R.id.editTextTextEmailAddress)
        var password: EditText = findViewById(R.id.editTextTextPassword)
        if (email.text.toString().isNotEmpty() && password.text.toString().isNotEmpty()) {
            val intent = Intent(this, fignya3::class.java)
            startActivity(intent)
        } else {
            val alert = AlertDialog.Builder(this)
                .setTitle("Ошибка")
                .setMessage("")
                .setPositiveButton("Ok", null)
                .create()
                .show()
        }
    }
}