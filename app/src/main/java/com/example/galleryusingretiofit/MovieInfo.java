package com.example.galleryusingretiofit;

import com.google.gson.annotations.SerializedName;

public class MovieInfo {


    public String name;
    public Url url;

    @SerializedName("timestamp")		//remember to use the annotation when there is name mismatch.
    public String timeStamp;

}
