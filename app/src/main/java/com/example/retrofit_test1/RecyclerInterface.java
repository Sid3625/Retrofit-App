package com.example.retrofit_test1;
import  retrofit2.Call;
import retrofit2.http.GET;

public interface RecyclerInterface {
    String JSONURL = "https://demonuts.com/Demonuts/JsonTest/Tennis/";

    @GET("json_parsing.php")
    Call<String> getString();
}
