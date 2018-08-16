package vn.gmo.gallery

import android.content.Context
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import vn.gmo.gallery.di.compoment.DaggerAppComponent
import vn.gmo.gallery.di.module.DatabaseModule

class App : DaggerApplication() {
    lateinit var androidInjector: AndroidInjector<out DaggerApplication>

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        androidInjector = DaggerAppComponent.builder()
                .application(this)
                .database(databaseModule())
                .build()
    }

    public override fun applicationInjector(): AndroidInjector<out DaggerApplication> = androidInjector

    protected open fun databaseModule(): DatabaseModule = DatabaseModule()
}