package vn.gmo.gallery.ui.cloud

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProviders
import vn.gmo.gallery.BR
import vn.gmo.gallery.R
import vn.gmo.gallery.databinding.FragmentCloudBinding
import vn.gmo.gallery.ui.base.BaseFragment

class CloudFragment : BaseFragment<FragmentCloudBinding, CloudViewModel>() {
    override val layoutId: Int
        get() = R.layout.fragment_cloud

    override fun getBindingVariable(): Int {
        return BR.viewModel
    }

    override fun getViewModel(): CloudViewModel {
        return ViewModelProviders.of(this, viewModelFactory).get(CloudViewModel::class.java)
    }

    override fun initData() {
    }

    override fun initView(root: View) {
    }

    override fun getArgument(bundle: Bundle?) {
    }
}