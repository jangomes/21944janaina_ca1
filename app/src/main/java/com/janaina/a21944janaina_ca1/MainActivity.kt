package com.janaina.a21944janaina_ca1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val edButton = findViewById<Button>(R.id.education_Button)
        edButton.setOnClickListener {
            val intent = Intent (this, SecondaryActivity ::class.java)
        startActivity(intent)
        }


        val skButton = findViewById<Button>(R.id.skill_Button)
        skButton.setOnClickListener {
            val intent = Intent (this, SecondaryActivity ::class.java)
            startActivity(intent)
        }

        val hoButton = findViewById<Button>(R.id.hobbies_Button)
        hoButton.setOnClickListener {
            val intent = Intent (this, SecondaryActivity ::class.java)
            startActivity(intent)
        }



        val acButton = findViewById<Button>(R.id.achi_Button)
        acButton.setOnClickListener {
            val intent = Intent (this, SecondaryActivity ::class.java)
            startActivity(intent)
        }


    }
}

