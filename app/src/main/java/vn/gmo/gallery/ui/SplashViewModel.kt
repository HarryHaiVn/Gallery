package vn.gmo.gallery.ui

import android.arch.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable

class SplashViewModel : ViewModel() {
    private val disposable: CompositeDisposable = CompositeDisposable()

    override fun onCleared() {
        super.onCleared()
        disposable.clear()
    }
}