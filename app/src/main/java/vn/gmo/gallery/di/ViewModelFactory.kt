package vn.gmo.gallery.di

import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import javax.inject.Inject
import javax.inject.Provider
import javax.inject.Singleton

@Singleton
class ViewModelFactory @Inject constructor(
        private val creators: Map<Class<out AndroidViewModel>,
                @JvmSuppressWildcards Provider<AndroidViewModel>>
) : ViewModelProvider.Factory {

    @Suppress("unchecked_cast")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        val creator = creators[modelClass as Class<AndroidViewModel>]
                ?: creators.entries.firstOrNull { (c, _) -> modelClass.isAssignableFrom(c) }?.value
                ?: throw IllegalArgumentException("Unknown model class $modelClass")

        return creator.get() as T
    }
}