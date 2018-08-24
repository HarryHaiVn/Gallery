package vn.gmo.gallery.di.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import vn.gmo.gallery.ui.cloud.CloudFragment
import vn.gmo.gallery.ui.picture.PictureFragment
import vn.gmo.gallery.ui.profile.ProfileFragment
import vn.gmo.gallery.ui.video.VideoFragment

@Suppress("unused")
@Module
abstract class FragmentBuildersModule {
    @ContributesAndroidInjector
    abstract fun contributeVideoFragment(): VideoFragment

    @ContributesAndroidInjector
    abstract fun contributePictureFragment(): PictureFragment

    @ContributesAndroidInjector
    abstract fun contributeProfileFragment(): ProfileFragment

    @ContributesAndroidInjector
    abstract fun contributeCloudFragment(): CloudFragment
}
