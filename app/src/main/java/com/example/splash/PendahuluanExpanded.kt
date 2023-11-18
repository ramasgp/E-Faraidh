package com.example.splash

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class PendahuluanExpanded : AppCompatActivity() {
    private lateinit var imgbutton1: ImageButton
    private lateinit var imgbutton2: ImageButton
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pendahuluan_expanded_page) // Mengatur tata letak untuk aktivitas pendahuluan expanded

        imgbutton1 = findViewById(R.id.arrowback)
        imgbutton1.setOnClickListener {
            val intent = Intent(this, MateriVideoPageActivity::class.java)
            startActivity(intent)
            finish()
        }

        imgbutton2 = findViewById(R.id.arrownext)
        imgbutton2.setOnClickListener {
            val intent = Intent(this, Bab1Expanded::class.java)
            startActivity(intent)
            finish()
        }
    }
}
