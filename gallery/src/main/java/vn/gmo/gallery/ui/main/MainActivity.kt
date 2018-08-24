package vn.gmo.gallery.ui.main

import android.view.Menu
import android.view.MenuItem
import androidx.lifecycle.ViewModelProviders
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*
import vn.gmo.gallery.BR
import vn.gmo.gallery.R
import vn.gmo.gallery.databinding.ActivityMainBinding
import vn.gmo.gallery.ui.base.BaseActivity
import vn.gmo.gallery.ui.cloud.CloudFragment
import vn.gmo.gallery.ui.picture.PictureFragment
import vn.gmo.gallery.ui.profile.ProfileFragment
import vn.gmo.gallery.ui.video.VideoFragment
import vn.gmo.gallery.utils.ext.replaceFragment
import vn.gmo.gallery.utils.ext.setFragment


class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>(), BottomNavigationView.OnNavigationItemSelectedListener {

    override fun getBindingVariable(): Int {
        return BR.viewModel
    }

    override fun getViewModel(): MainViewModel {
        return ViewModelProviders.of(this, viewModelFactory)
                .get(MainViewModel::class.java)
    }

    override val layoutId: Int
        get() = R.layout.activity_main

    override fun initView() {
        setSupportActionBar(toolbar)
    }

    override fun initData() {
        setFragment(R.id.container, ::PictureFragment)
        mViewDataBinding.bottomNavMain.setOnNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            mViewDataBinding.bottomNavMain.selectedItemId -> return false
            R.id.action_picture -> replaceFragment(R.id.container, ::PictureFragment)
            R.id.action_video -> replaceFragment(R.id.container, ::VideoFragment)
            R.id.action_cloud -> replaceFragment(R.id.container, ::CloudFragment)
            R.id.action_profile -> replaceFragment(R.id.container, ::ProfileFragment)
        }
        return true
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item!!.itemId) {
//            R.id.action_settings -> toast("Click action settings")
//            R.id.action_search -> toast("Click action search")
        }
        return false
    }
}