package vn.gmo.gallery.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy

@Dao
interface PhotoDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun save(photo: PhotoEntity): Long

//    @Query("SELECT * FROM photo")
//    fun get(): Single<PhotoEntity>
}