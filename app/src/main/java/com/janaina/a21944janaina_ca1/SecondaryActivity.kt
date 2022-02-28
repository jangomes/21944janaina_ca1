package com.janaina.a21944janaina_ca1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondaryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)

        val edButton = findViewById<Button>(R.id.education_Button2)
        edButton.setOnClickListener {
            val intent = Intent (this, SecondaryActivity ::class.java)
            startActivity(intent)
        }

        val skButton = findViewById<Button>(R.id.skill_Button2)
        skButton.setOnClickListener {
            val intent = Intent (this, ThirdActivity ::class.java)
            startActivity(intent)
        }

        val hoButton = findViewById<Button>(R.id.hobbies_Button2)
        hoButton.setOnClickListener {
            val intent = Intent (this, FourthActivity ::class.java)
            startActivity(intent)
        }

        val acButton = findViewById<Button>(R.id.achi_Button2)
        acButton.setOnClickListener {
            val intent = Intent (this, FifthActivity ::class.java)
            startActivity(intent)
        }


        val homeButton = findViewById<Button>(R.id.home_button)
        homeButton.setOnClickListener {
            val intent = Intent (this, MainActivity ::class.java)
            startActivity(intent)
        }
    }
}