package vn.gmo.gallery.di

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import vn.gmo.gallery.ui.cloud.CloudViewModel
import vn.gmo.gallery.ui.main.MainViewModel
import vn.gmo.gallery.ui.picture.PictureViewModel
import vn.gmo.gallery.ui.profile.ProfileViewModel
import vn.gmo.gallery.ui.video.VideoViewModel
import vn.gmo.gallery.viewmodel.GalleryViewModelFactory

@Suppress("unused")
@Module
abstract class ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(VideoViewModel::class)
    abstract fun bindInfoViewModel(videoViewModel: VideoViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(PictureViewModel::class)
    abstract fun bindPictureViewModel(pictureViewModel: PictureViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(ProfileViewModel::class)
    abstract fun bindProfileViewModel(profileViewModel: ProfileViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(CloudViewModel::class)
    abstract fun bindCloudViewModel(cloudViewModel: CloudViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun bindMainViewModel(mainViewModel: MainViewModel): ViewModel

    @Binds
    abstract fun bindViewModelFactory(factory: GalleryViewModelFactory): ViewModelProvider.Factory
}
