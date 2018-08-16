package vn.gmo.gallery.ui.fragment

import android.os.Bundle
import android.view.View
import vn.gmo.gallery.R
import vn.gmo.gallery.databinding.FragmentHomeBinding
import vn.gmo.gallery.ui.base.BaseFragment

class HomeFragment : BaseFragment<FragmentHomeBinding>() {
    override val layoutId: Int
        get() = R.layout.fragment_home

    override fun initData() {
    }

    override fun initView(root: View) {
    }

    override fun getArgument(bundle: Bundle?) {
    }
}
