package com.example.a3r

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var botSes:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        botSes=findViewById(R.id.button4)
        botSes.setOnClickListener {
            val intent=Intent(this,Registro::class.java)
            startActivity(intent)
            this.finish()
        }
    }

}