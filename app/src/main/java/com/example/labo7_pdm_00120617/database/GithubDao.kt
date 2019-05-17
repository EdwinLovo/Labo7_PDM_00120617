package com.example.labo7_pdm_00120617.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface GithubDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(repo:GithubRepo)

    @Query("select * from repos")
    fun getAllRepos():LiveData<List<GithubRepo>>

    @Query("delete from repos")
    fun nukeTable()
}