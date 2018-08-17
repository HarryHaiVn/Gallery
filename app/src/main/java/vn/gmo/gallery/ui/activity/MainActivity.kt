package vn.gmo.gallery.ui.activity

import android.support.design.widget.BottomNavigationView
import android.view.Menu
import android.view.MenuItem
import androidx.core.widget.toast
import kotlinx.android.synthetic.main.activity_main.*
import vn.gmo.gallery.R
import vn.gmo.gallery.databinding.ActivityMainBinding
import vn.gmo.gallery.ui.base.BaseActivity
import vn.gmo.gallery.ui.fragment.HomeFragment
import vn.gmo.gallery.ui.fragment.InfoFragment
import vn.gmo.gallery.ui.fragment.ProfileFragment
import vn.gmo.gallery.utils.ext.replaceFragment
import vn.gmo.gallery.utils.ext.setFragment


class MainActivity : BaseActivity<ActivityMainBinding>(), BottomNavigationView.OnNavigationItemSelectedListener {

    override val layoutId: Int
        get() = R.layout.activity_main

    override fun initView() {
        setSupportActionBar(toolbar)
    }

    override fun initData() {
        setFragment(R.id.container, ::HomeFragment)
        viewDataBinding!!.bottomNavMain.setOnNavigationItemSelectedListener(this)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            viewDataBinding!!.bottomNavMain.selectedItemId -> return false
            R.id.action_home -> replaceFragment(R.id.container, ::HomeFragment)
            R.id.action_info -> replaceFragment(R.id.container, ::InfoFragment)
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
            R.id.action_settings -> toast("Click action settings")
            R.id.action_search -> toast("Click action search")
        }
        return false
    }
}