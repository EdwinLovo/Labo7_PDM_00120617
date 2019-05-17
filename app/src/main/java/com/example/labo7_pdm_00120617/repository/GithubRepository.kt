package com.example.labo7_pdm_00120617.repository

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import com.example.labo7_pdm_00120617.database.GithubDao
import com.example.labo7_pdm_00120617.database.GithubRepo

class GithubRepository(private val repoDao: GithubDao) {

    @WorkerThread
    suspend fun insert(repo:GithubRepo){
        repoDao.insert(repo)
    }

    fun getAll():LiveData<List<GithubRepo>> = repoDao.getAllRepos()

    fun nuke() = repoDao.nukeTable()
}