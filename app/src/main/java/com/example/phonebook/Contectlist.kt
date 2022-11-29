package com.example.phonebook

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class Contectlist : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contectlist)
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        val edit1 = findViewById<Button>(R.id.edit1)
        val text1 = findViewById<TextView>(R.id.textView1)

        edit1 .setOnClickListener(){
            intent = Intent(this,Contectedit::class.java)
            startActivity(intent)

        }
        text1 .setOnClickListener(){
            intent = Intent(this,Contectinfo::class.java)
            startActivity(intent)

        }
        bottomNavigationView.setOnNavigationItemSelectedListener(BottomNavigationView.OnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.add_user -> {
                    startActivity(
                        Intent(
                            applicationContext, Contectadd::class.java
                        )
                    )
                    overridePendingTransition(0, 0)
                    return@OnNavigationItemSelectedListener true
                }
                R.id.list_user -> return@OnNavigationItemSelectedListener true
            }
            false
        })

    }
}
