package vn.gmo.gallery.di.module

import dagger.Module
import dagger.Provides
import okhttp3.Cache
import okhttp3.OkHttpClient
import vn.gmo.gallery.GalleryApp
import vn.gmo.gallery.utils.Memory
import java.io.File
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
open class NetworkModule {

    open fun buildOkHttpClient(galleryApp: GalleryApp): OkHttpClient =
            OkHttpClient.Builder()
                    .connectTimeout(10L, TimeUnit.SECONDS)
                    .writeTimeout(10L, TimeUnit.SECONDS)
                    .readTimeout(30L, TimeUnit.SECONDS)
                    .cache(Cache(File(galleryApp.cacheDir, "OkCache"),
                            Memory.calcCacheSize(galleryApp, .25f)))
                    .build()

    @Provides
    @Singleton
    fun provideOkHttpClient(galleryApp: GalleryApp): OkHttpClient = buildOkHttpClient(galleryApp)
}