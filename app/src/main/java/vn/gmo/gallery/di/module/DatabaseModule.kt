package vn.gmo.gallery.di.module

import android.arch.persistence.room.Room
import dagger.Module
import dagger.Provides
import vn.gmo.gallery.GalleryApp
import vn.gmo.gallery.room.AppDatabase
import vn.gmo.gallery.room.PhotoDao
import javax.inject.Singleton

@Module
class DatabaseModule {
    @Provides
    @Singleton
    fun provideDatabase(galleryApp: GalleryApp): AppDatabase {
        return Room.databaseBuilder(galleryApp, AppDatabase::class.java, "photo.db")
                .fallbackToDestructiveMigration()
                .build()
    }

    @Provides
    @Singleton
    fun providePhotoDao(db: AppDatabase): PhotoDao = db.photoDao
}