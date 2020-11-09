package com.juliane.biscoitim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        //Passar para a proxima tela (MainActivity) apos 5 segundos
        Handler(Looper.getMainLooper()).postDelayed({
            //iniciar a intencao de passar para a proxima tela (Intent)
            val mIntent = Intent(this, MainActivity::class.java)
            startActivity(mIntent)
            finish()
        }, 5000)

    }
}