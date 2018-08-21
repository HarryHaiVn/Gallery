package vn.gmo.gallery

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import vn.gmo.gallery.di.compoment.DaggerAppComponent

class App : DaggerApplication() {

    lateinit var androidInjector: AndroidInjector<out DaggerApplication>

    public override fun applicationInjector(): AndroidInjector<out DaggerApplication> = androidInjector

    override fun onCreate() {
        super.onCreate()
        androidInjector = DaggerAppComponent.builder()
                .application(this)
                .build()
    }
}