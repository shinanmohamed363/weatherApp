package com.example.weatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class forcust : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forcust)

        val button1 = findViewById<Button>(R.id.futurecard)
        button1.setOnClickListener {
            val intent = Intent(applicationContext, futureforcust::class.java)
            startActivity(intent)




        }
    }

}