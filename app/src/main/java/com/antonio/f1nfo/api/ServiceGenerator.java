package com.antonio.f1nfo.api;

import android.util.Log;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by antonio on 2/8/16.
 */
public class ServiceGenerator {
    private static Retrofit.Builder builder;
    public static final String API_BASE_URL = "http://ergast.com/api/";
    private static OkHttpClient httpClient;
//
//    public ServiceGenerator(){
//
//    }

    public static <S> S createService(Class<S> serviceClass) {
        httpClient = new OkHttpClient();
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(interceptor).build();

        Log.i("generetor", "called");

        builder = new Retrofit.Builder()
                .baseUrl(API_BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create());
                //.client(httpClient)

        Retrofit retrofit = builder. build();
        return retrofit.create(serviceClass);
    }
}
