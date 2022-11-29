package com.example.phonebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Contectinfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contectinfo)

        val edit = findViewById<Button>(R.id.editbtn)
        val delete = findViewById<Button>(R.id.deletebtn)

        edit .setOnClickListener(){
            intent = Intent(this,Contectedit::class.java)
            startActivity(intent)

        }
        delete .setOnClickListener(){
            intent = Intent(this,Contectlist::class.java)
            startActivity(intent)

        }
    }
}