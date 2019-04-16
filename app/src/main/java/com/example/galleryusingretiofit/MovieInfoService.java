package com.example.galleryusingretiofit;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface MovieInfoService {


    @GET
    Call<ArrayList<MovieInfo>> movieInfoList(
            @Url String url
    );

}
