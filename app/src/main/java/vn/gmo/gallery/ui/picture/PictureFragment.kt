package vn.gmo.gallery.ui.picture

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.view.View
import vn.gmo.gallery.BR
import vn.gmo.gallery.R
import vn.gmo.gallery.databinding.FragmentPictureBinding
import vn.gmo.gallery.ui.base.BaseFragment

class PictureFragment : BaseFragment<FragmentPictureBinding, PictureViewModel>() {
    override val layoutId: Int
        get() = R.layout.fragment_picture

    override fun getBindingVariable(): Int {
        return BR.viewModel
    }

    override fun getViewModel(): PictureViewModel {
        return ViewModelProviders.of(this, viewModelFactory)
                .get(PictureViewModel::class.java)
    }

    override fun initData() {
    }

    override fun initView(root: View) {
    }

    override fun getArgument(bundle: Bundle?) {
    }
}
