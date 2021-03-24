package com.example.a0317

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        var UserName = findViewById<EditText>(R.id.UserName)
        var ButtonLogin = findViewById<Button>(R.id.ButtonLogin)
        ButtonLogin.setOnClickListener(){
            var edUsername = findViewById<EditText>(R.id.UserName)
            val myintent= Intent(applicationContext , MainActivity::class.java).apply{
                putExtra("user" ,edUsername.text.toString())
            }
            startActivity(myintent)
        }


    }
}