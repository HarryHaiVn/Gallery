package vn.gmo.gallery.ui.splash

import android.annotation.SuppressLint
import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import vn.gmo.gallery.BR
import vn.gmo.gallery.R
import vn.gmo.gallery.databinding.ActivitySplashBinding
import vn.gmo.gallery.ui.base.BaseActivity
import javax.inject.Inject


class SplashActivity : BaseActivity<ActivitySplashBinding, SplashViewModel>() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    val splashViewModel: SplashViewModel by lazy {
        ViewModelProviders.of(this, viewModelFactory).get(SplashViewModel::class.java)
    }
    override val layoutId: Int
        @SuppressLint("ResourceType")
        get() = R.layout.activity_splash

    override fun initView() {
//        val intent = Intent(this, MainActivity::class.java)
//        Timer().schedule(1000) {
//            startActivity(intent)
//            finish()
//        }
    }

    override fun getViewModel(): SplashViewModel {
        return splashViewModel
    }

    override fun getBindingVariable(): Int {
        return BR.viewModel
    }

    override fun initData() {
    }
}