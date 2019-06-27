package com.example.androidlatihanmix_socialmedia

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.login.*

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        btn_register.setOnClickListener {
            startActivity(Intent(this, Register::class.java))
        }
    }

}