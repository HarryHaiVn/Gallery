package vn.gmo.gallery.ui.activity

import android.view.Menu
import android.view.MenuItem
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.activity_main.*
import vn.gmo.gallery.R
import vn.gmo.gallery.databinding.ActivityMainBinding
import vn.gmo.gallery.ui.base.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override val layoutId: Int
        get() = R.layout.activity_main

    override fun initView() {
//        setSupportActionBar(toolbar)
    }

    override fun initData() {
        setupNavigation()
    }

    private fun setupNavigation() {
        val navController = findNavController(R.id.mainNavigationFragment)
//        setupActionBarWithNavController(this, navController)
        NavigationUI.setupWithNavController(bottomNavigationView, navController)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item!!.itemId) {
        }
        return false
    }

    override fun onSupportNavigateUp() =
            findNavController(R.id.mainNavigationFragment).navigateUp()
}
