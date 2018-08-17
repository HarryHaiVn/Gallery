package vn.gmo.gallery.ui.base

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.support.annotation.LayoutRes
import android.support.v4.app.ActivityCompat
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

abstract class BaseFragment<T : ViewDataBinding> : Fragment() {
    private var viewDataBinding: T? = null

    private lateinit var rootView: View
    private lateinit var mActivity: BaseActivity<*>

    @get:LayoutRes
    protected abstract val layoutId: Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mActivity = (activity as BaseActivity<*>?)!!
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        rootView = performDataBinding(inflater, container)!!.root
        if (arguments != null) {
            getArgument(arguments)
        }
        initView(rootView)
        initData()
        return rootView
    }

    private fun performDataBinding(inflater: LayoutInflater, container: ViewGroup?): ViewDataBinding? {
        viewDataBinding = DataBindingUtil.inflate(inflater, layoutId, container, false)
        return viewDataBinding
    }

    abstract fun initData()

    abstract fun initView(root: View)

    abstract fun getArgument(bundle: Bundle?)

    fun onBackPress() {
        val backStackCnt = fragmentManager!!.backStackEntryCount
        if (backStackCnt > 1) {
            fragmentManager!!.popBackStack()
        } else {
            ActivityCompat.finishAffinity(activity!!)
        }
    }

}
