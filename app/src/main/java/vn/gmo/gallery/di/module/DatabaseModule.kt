package vn.gmo.gallery.di.module

import androidx.room.Room
import dagger.Module
import dagger.Provides
import vn.gmo.gallery.App
import vn.gmo.gallery.room.AppDatabase
import vn.gmo.gallery.room.PhotoDao
import javax.inject.Singleton

@Module
class DatabaseModule {
    @Provides
    @Singleton
    fun provideDatabase(app: App): AppDatabase {
        return Room.databaseBuilder(app, AppDatabase::class.java, "photo.db")
                .fallbackToDestructiveMigration()
                .build()
    }

    @Provides
    @Singleton
    fun providePhotoDao(db: AppDatabase): PhotoDao = db.photoDao
}