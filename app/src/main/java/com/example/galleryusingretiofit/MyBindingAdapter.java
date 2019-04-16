package com.example.galleryusingretiofit;

import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MyBindingAdapter {

    public static void setImageByGlide(ImageView view, String imgUrl) {

        Glide.with(view.getContext())
                .load(imgUrl)
                .thumbnail(0.1f)
                .into(view);

    }
}
