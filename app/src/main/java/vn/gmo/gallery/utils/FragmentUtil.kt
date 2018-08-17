package vn.gmo.gallery.utils

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentActivity
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction
import vn.gmo.gallery.R

import vn.gmo.gallery.ui.base.BaseActivity
import vn.gmo.gallery.ui.base.BaseFragment

object FragmentUtil {

    /**
     * create new instance of [Fragment]
     *
     * @return instance
     */
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    fun <T : Fragment> newInstance(clazz: Class<T>, args: Bundle): T? {
        try {
            val t = clazz.newInstance()
            t.arguments = args
            return t
        } catch (e: InstantiationException) {
            e.printStackTrace()
        } catch (e: IllegalAccessException) {
            e.printStackTrace()
        }

        return null
    }

    fun replaceFragment(fragmentManager: FragmentManager?, fragment: Fragment,
                        isPushInsteadOfReplace: Boolean, data: Bundle?,
                        tag: String?, isShowAnimation: Boolean) {
        if (fragmentManager == null) {
            return
        }

        if (data != null) {
            fragment.arguments = data
        }

        val fragmentTransaction = fragmentManager.beginTransaction()

        if (isShowAnimation) {
            fragmentTransaction.setCustomAnimations(R.anim.fade_in,
                    R.anim.fade_out, R.anim.fade_in, R.anim.fade_out)
        }

        fragmentTransaction.replace(R.id.container, fragment, tag)
        if (isPushInsteadOfReplace) {
            fragmentTransaction.addToBackStack(fragment.javaClass.name)
        }

        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_NONE)
        fragmentTransaction.commit()
    }

    fun addFragment(fragmentManager: FragmentManager?, fragment: Fragment,
                    isPushInsteadOfReplace: Boolean, data: Bundle?,
                    tag: String?, isShowAnimation: Boolean) {
        if (fragmentManager == null) {
            return
        }

        if (data != null) {
            fragment.arguments = data
        }

        val fragmentTransaction = fragmentManager.beginTransaction()

        if (isShowAnimation) {
            fragmentTransaction.setCustomAnimations(R.anim.fade_in,
                    R.anim.fade_out, R.anim.fade_in, R.anim.fade_out)
        }

        fragmentTransaction.add(R.id.container, fragment, tag)
        if (isPushInsteadOfReplace) {
            fragmentTransaction.addToBackStack(fragment.javaClass.name)
        }

        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_NONE)
        fragmentTransaction.commit()
    }

    fun addFragment(activity: FragmentActivity?, fragment: Fragment,
                    isAddToBackStack: Boolean, tag: String?) {
        if (activity == null) {
            return
        }
        val fragmentTransaction = activity.supportFragmentManager
                .beginTransaction()
        fragmentTransaction.add(R.id.container, fragment, tag)
        if (isAddToBackStack) {
            fragmentTransaction.addToBackStack(tag)
        }

        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_NONE)
        fragmentTransaction.commit()
    }

    fun getCurrentFragment(activity: BaseActivity<*>): BaseFragment<*>? {
        @SuppressLint("RestrictedApi")
        val fragments = activity.supportFragmentManager.fragments
        for (i in fragments.indices.reversed()) {
            val fragment = fragments[i]
            if (fragment != null && fragment.isVisible)
                if (fragment is BaseFragment<*>) {
                    return fragment
                }
        }
        return null
    }
}
