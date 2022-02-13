package com.example.placementcell

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.Button
import android.widget.TextView

class formfor_tandpcell : AppCompatActivity() {

    private  lateinit var btn_feedback: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formfor_tandpcell)

        supportActionBar?.hide()

        val text_contact_of_users1 : TextView = findViewById( R.id.text_contact_of_users1)

        text_contact_of_users1.movementMethod = LinkMovementMethod.getInstance()
        text_contact_of_users1.setLinkTextColor(Color.GREEN)

        btn_feedback = findViewById(R.id.button_feedback)

        btn_feedback.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            finish()
            startActivity(intent)
        }


    }
}