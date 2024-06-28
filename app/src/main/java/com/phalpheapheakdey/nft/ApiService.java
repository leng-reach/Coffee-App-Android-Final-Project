package com.phalpheapheakdey.nft;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
public interface ApiService {
    @GET("https://fakestoreapi.com/products/")
    Call<List<ProductModel>> getData();
}
