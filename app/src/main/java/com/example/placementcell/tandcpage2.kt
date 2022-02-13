package com.example.placementcell

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.widget.Button
import android.widget.TextView

class tandcpage2 : AppCompatActivity() {

    private lateinit var button_5: Button
    private lateinit var button_6: Button
    private lateinit var button_7: Button

    private lateinit var button_forward_1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tandcpage2)

        supportActionBar?.hide()

        val text_product4_description: TextView = findViewById( R.id.text_product4_description)

        text_product4_description.movementMethod = LinkMovementMethod.getInstance()
        text_product4_description.setLinkTextColor(Color.BLACK)

        val text_product6_description: TextView = findViewById( R.id.text_product6_description)

        text_product6_description.movementMethod = LinkMovementMethod.getInstance()
        text_product6_description.setLinkTextColor(Color.BLACK)

        val text_product5_description: TextView = findViewById( R.id.text_product5_description)

        text_product5_description.movementMethod = LinkMovementMethod.getInstance()
        text_product5_description.setLinkTextColor(Color.BLACK)

        button_5 = findViewById(R.id.btn_5)

        button_5.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
        }

        button_6 = findViewById(R.id.btn_6)

        button_6.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
        }

        button_7 = findViewById(R.id.btn_7)

        button_7.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
        }

        button_forward_1 = findViewById(R.id.btn_forward_1)

        button_forward_1.setOnClickListener {
            val intent = Intent(this, tandcpage3::class.java)

            startActivity(intent)
        }

    }
}