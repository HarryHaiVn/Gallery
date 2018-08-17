package vn.gmo.gallery.room

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy

@Dao
interface PhotoDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun save(photo: PhotoEntity): Long

//    @Query("SELECT * FROM photo")
//    fun get(): Single<PhotoEntity>
}