package com.rj.retrofitwebserviceexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.rj.retrofitwebserviceexample.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getUserData();


    }

    private void getUserData() {

        Call<List<User>> userList=  RetrofitObj.getRetrofitApi().getUser();
        userList.enqueue(new Callback<List<User>>() {
            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                if(response.isSuccessful()){
                    List<User> userList1 = response.body();
                    User user = userList1.get(0);

                }else{

                }
            }

            @Override
            public void onFailure(Call<List<User>> call, Throwable t) {

            }
        });
    }
}
