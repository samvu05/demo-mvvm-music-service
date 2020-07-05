package com.sam.examviewmodel.viewmodel

import androidx.databinding.ObservableBoolean
import androidx.lifecycle.MutableLiveData
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import com.sam.examviewmodel.model.SongSearch
import com.sam.examviewmodel.repository.SongRepository
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class SongViewModel {
    //notification den view chi su dung isLoading
    val isLoading = ObservableBoolean(false)
    private val repository:SongRepository
    val songs = MutableLiveData<MutableList<SongSearch>>()
    val finishGetLinkSong = MutableLiveData<SongSearch>()

    init {
        repository = Retrofit.Builder()
            .baseUrl("https://songserver.herokuapp.com")
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(
                RxJava2CallAdapterFactory.create()
            ).build()
            .create(SongRepository::class.java)
    }



}