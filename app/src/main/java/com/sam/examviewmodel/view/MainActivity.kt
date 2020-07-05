package com.sam.examviewmodel.view

import androidx.databinding.DataBindingUtil
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.sam.examviewmodel.R
import com.sam.examviewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.rcSong.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = SongAdapter(
                if (musicServ)

            )
        }
    }
}