package com.coelhoslab.android.appointmentapp.ui.activity.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.coelhoslab.android.appointmentapp.R
import com.coelhoslab.android.appointmentapp.ui.activity.main.MainActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

//        <---------------------------------- Temporizar Tela de Splash -------------------------------------->
        Handler().postDelayed({
            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
            finish()
        }, 4000L)

    }
}