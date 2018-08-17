package vn.gmo.gallery.ui.activity

import android.annotation.SuppressLint
import android.content.Intent
import vn.gmo.gallery.R
import vn.gmo.gallery.databinding.ActivitySplashBinding
import vn.gmo.gallery.ui.SplashViewModel
import vn.gmo.gallery.ui.base.BaseActivity
import java.util.*
import kotlin.concurrent.schedule
import kotlin.reflect.jvm.internal.impl.javax.inject.Inject


class SplashActivity : BaseActivity<ActivitySplashBinding>() {
    @Inject
    lateinit var splashViewModel: SplashViewModel
    override val layoutId: Int
        @SuppressLint("ResourceType")
        get() = R.layout.activity_splash

    override fun initView() {
        val intent = Intent(this, MainActivity::class.java)
        Timer().schedule(1000) {
            startActivity(intent)
            finish()
        }
    }

    override fun initData() {
    }
}