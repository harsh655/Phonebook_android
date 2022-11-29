package com.example.phonebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.bottomnavigation.BottomNavigationView

class Contectadd : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contectadd)

        val save = findViewById<Button>(R.id.savebtn)
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        save .setOnClickListener(){
            intent = Intent(this,Contectlist::class.java)
            startActivity(intent)

        }
        bottomNavigationView.setOnNavigationItemSelectedListener(BottomNavigationView.OnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.list_user -> {
                    startActivity(
                        Intent(
                            applicationContext, Contectlist::class.java
                        )
                    )
                    overridePendingTransition(0, 0)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.add_user -> return@OnNavigationItemSelectedListener true
            }
            false
        })
    }
}