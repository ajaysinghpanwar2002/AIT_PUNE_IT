package com.example.placementcell

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.os.Handler

class splash_screen_saarthi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen_saarthi)

        supportActionBar?.hide()

        val backgroundImg: ImageView = findViewById(R.id.iv_logo)
        val slideAnimation = AnimationUtils.loadAnimation(this,R.anim.slide)
        backgroundImg.startAnimation(slideAnimation)

        Handler().postDelayed({
            startActivity(Intent(this,Login::class.java))
            finish()
        },4000)
    }
}