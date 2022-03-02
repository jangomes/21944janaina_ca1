package com.janaina.a21944janaina_ca1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FourthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_four)

        val edButton = findViewById<Button>(R.id.education_Button4)
        edButton.setOnClickListener {
            val intent = Intent (this, SecondaryActivity ::class.java)
            startActivity(intent)
        }

        val skButton = findViewById<Button>(R.id.skill_Button4)
        skButton.setOnClickListener {
            val intent = Intent (this, ThirdActivity ::class.java)
            startActivity(intent)
        }

        val hoButton = findViewById<Button>(R.id.hobbies_Button4)
        hoButton.setOnClickListener {
            val intent = Intent (this, FourthActivity ::class.java)
            startActivity(intent)
        }

        val acButton = findViewById<Button>(R.id.achi_Button4)
        acButton.setOnClickListener {
            val intent = Intent (this, FifthActivity ::class.java)
            startActivity(intent)
        }

        val homeButton = findViewById<Button>(R.id.home_button)
        homeButton.setOnClickListener {
            val intent = Intent (this, MainActivity ::class.java)
            startActivity(intent)
        }

        val backButton4 = findViewById<Button>(R.id.back_button4)
        backButton4.setOnClickListener {
            val intent = Intent (this, ThirdActivity ::class.java)
            startActivity(intent)
        }

        val nextButton4 = findViewById<Button>(R.id.next_button4)
        nextButton4.setOnClickListener {
            val intent = Intent (this, FifthActivity ::class.java)
            startActivity(intent)
        }
    }
}