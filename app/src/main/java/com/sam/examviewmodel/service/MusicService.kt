package com.sam.examviewmodel.service

import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.sam.examviewmodel.viewmodel.SongViewModel

class MusicService:Service() {
    private lateinit var model:SongViewModel
    private lateinit var mpManager:MusicManager

    override fun onBind(intent: Intent?): IBinder? {
        TODO("Not yet implemented")
    }
}