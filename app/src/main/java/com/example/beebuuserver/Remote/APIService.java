package com.example.beebuuserver.Remote;

import com.example.beebuuserver.Model.MyResponse;
import com.example.beebuuserver.Model.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAABM8xUcg:APA91bHGVlFng7WAHQqi2eTkeToR-y9503TYu6qQrBItsFm-oGEcxPio5tyFBZgJo22izTWGx_LpY8VMFi54GIxv-4XD0yxM0FvPtnSoQYfnfePoXk6Og7x9nST5UF7iqQl1e3k9yblm"
            }
    )
    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
