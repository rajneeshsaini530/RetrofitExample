package com.rj.retrofitwebserviceexample;

import com.rj.retrofitwebserviceexample.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitApi {


    @GET("posts")
    Call<List<User>> getUser();


}
