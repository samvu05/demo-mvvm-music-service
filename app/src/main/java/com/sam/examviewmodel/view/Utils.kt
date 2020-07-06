package com.sam.examviewmodel.view

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.sam.examviewmodel.R
import com.sam.examviewmodel.model.SongSearch

class Utils {
    //Cac phuong thuc, thuoc tinh static nen nam trong companion object

    companion object{
        @JvmStatic
        @BindingAdapter("loadImage")
        fun loadImage(iv:ImageView,link:String){
            if (link == null || link.equals("")){
                Glide.with(iv)
                    .load(R.drawable.iv_bg)
                    .into(iv)
            }
            else{
                Glide.with(iv)
                    .load(link)
                    .placeholder(R.drawable.iv_bg)
                    .error(R.drawable.iv_bg)
                    .into(iv)
            }
        }

    }
}