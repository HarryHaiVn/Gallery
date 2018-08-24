package vn.gmo.gallery.ui.profile

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProviders
import vn.gmo.gallery.BR
import vn.gmo.gallery.R
import vn.gmo.gallery.databinding.FragmentProfileBinding
import vn.gmo.gallery.ui.base.BaseFragment

class ProfileFragment : BaseFragment<FragmentProfileBinding, ProfileViewModel>() {

    override val layoutId: Int
        get() = R.layout.fragment_profile

    override fun getBindingVariable(): Int {
        return BR.viewModel
    }

    override fun getViewModel(): ProfileViewModel {
        return ViewModelProviders.of(this, viewModelFactory)
                .get(ProfileViewModel::class.java)
    }

    override fun initData() {
    }

    override fun initView(root: View) {
    }

    override fun getArgument(bundle: Bundle?) {
    }
}