    package com.example.phonebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

    class Splashpage : AppCompatActivity() {

    private val LENGTH: Long = 5000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashpage)

        supportActionBar!!.hide()

        Handler().postDelayed({
            val listIntent = Intent(this@Splashpage, Contectlist::class.java)
            this@Splashpage.startActivity(listIntent)
            this@Splashpage.finish()
        }, LENGTH)
    }
}