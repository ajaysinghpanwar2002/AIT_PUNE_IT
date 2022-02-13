package com.example.placementcell

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.firebase.auth.FirebaseAuth

class first_interface : AppCompatActivity() {

    private  lateinit var btnrecuriter: Button
    private  lateinit var btntandpcell: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_interface)


        supportActionBar?.hide()

        btntandpcell = findViewById(R.id.button_tandpcell)
        btnrecuriter = findViewById(R.id.button_recuriter)


        btntandpcell.setOnClickListener {
            val intent = Intent(this, formfor_tandpcell::class.java)
            finish()
            startActivity(intent)
        }

        btnrecuriter.setOnClickListener {
            val intent = Intent(this, tandcpage1::class.java)
            finish()
            startActivity(intent)
        }


    }
}