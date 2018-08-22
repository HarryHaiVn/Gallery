package vn.gmo.gallery.ui.splash

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import vn.gmo.gallery.R
import vn.gmo.gallery.ui.main.MainActivity
import java.util.*
import kotlin.concurrent.schedule


class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val intent = Intent(this, MainActivity::class.java)
        Timer().schedule(1000) {
            startActivity(intent)
            finish()
        }
    }
}