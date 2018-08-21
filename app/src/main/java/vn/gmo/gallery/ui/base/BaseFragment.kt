package vn.gmo.gallery.ui.base

import android.content.Context
import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.support.annotation.LayoutRes
import android.support.v4.app.ActivityCompat
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.android.support.AndroidSupportInjection

abstract class BaseFragment<T : ViewDataBinding, V : BaseViewModel> : Fragment() {

    private var viewDataBinding: T? = null
    private lateinit var mViewModel: V
    private lateinit var rootView: View
    private var mActivity: BaseActivity<*, *>? = null

    /**
     * @return layout resource id
     */
    @get:LayoutRes
    protected abstract val layoutId: Int

    /**
     * Override for set binding variable
     *
     * @return variable id
     */
    abstract fun getBindingVariable(): Int

    /**
     * Override for set view model
     *
     * @return view model instance
     */
    abstract fun getViewModel(): V

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if (context is BaseActivity<*, *>) {
            this.mActivity = context
            context.onFragmentAttached()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        performDependencyInjection()
        super.onCreate(savedInstanceState)
        mViewModel = getViewModel()

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

    private fun performDependencyInjection() {
        AndroidSupportInjection.inject(this)
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

    override fun onDetach() {
        super.onDetach()
        mActivity?.hideKeyboard()
    }

    interface Callback {

        fun onFragmentAttached()

        fun onFragmentDetached(tag: String)
    }
}
