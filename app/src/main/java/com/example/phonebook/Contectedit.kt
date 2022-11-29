package com.example.phonebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Contectedit : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contectedit)

        val save = findViewById<Button>(R.id.save)

        save .setOnClickListener(){
            intent = Intent(this,Contectlist::class.java)
            startActivity(intent)

        }
    }
}