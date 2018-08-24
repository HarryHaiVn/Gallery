package vn.gmo.gallery.ui.video

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProviders
import vn.gmo.gallery.BR
import vn.gmo.gallery.R
import vn.gmo.gallery.databinding.FragmentVideoBinding
import vn.gmo.gallery.ui.base.BaseFragment


class VideoFragment : BaseFragment<FragmentVideoBinding, VideoViewModel>() {

    override val layoutId: Int
        get() = R.layout.fragment_video

    override fun getBindingVariable(): Int {
        return BR.viewModel
    }

    override fun getViewModel(): VideoViewModel {
        return ViewModelProviders.of(this, viewModelFactory)
                .get(VideoViewModel::class.java)
    }

    override fun initData() {
    }

    override fun initView(root: View) {
    }

    override fun getArgument(bundle: Bundle?) {
    }
}