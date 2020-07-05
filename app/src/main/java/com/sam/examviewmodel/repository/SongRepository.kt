package com.sam.examviewmodel.repository

import com.sam.examviewmodel.model.SongLink
import com.sam.examviewmodel.model.SongSearch
import retrofit2.http.GET
import retrofit2.http.Query
import io.reactivex.Observable
import java.util.*

interface SongRepository {
    @GET("/api/searchSong")
    fun searchSong(
        @Query(value = "songName")
        name:String
    ):Observable<MutableList<SongSearch>>

    @GET("/api/linkMusic")
    fun getLinkMusic(
        @Query(value = "linkSong")
        linkSong:String
    ) :Observable<SongLink>
}