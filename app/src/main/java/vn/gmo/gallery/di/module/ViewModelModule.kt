package vn.gmo.gallery.di.module

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import vn.gmo.gallery.di.RepositoryModule
import vn.gmo.gallery.di.ViewModelFactory
import vn.gmo.gallery.di.ViewModelKey
import vn.gmo.gallery.ui.splash.SplashViewModel

@Module(includes = [RepositoryModule::class])
interface ViewModelModule {
    @Binds
    fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(SplashViewModel::class)
    fun bindMainViewModel(viewModel: SplashViewModel): ViewModel
}