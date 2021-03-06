package com.example.networking_retrofitmovies;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface GetData {

    @GET("/3/movie/{category}")
    Call<MovieResults.Example> getMovies(
            @Path("category") String category,
            @Query("api_key") String apiKey
    );

}