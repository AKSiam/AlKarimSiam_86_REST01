package com.example.alkarimsiam_86_rest01

import retrofit2.http.GET

interface ApiService {
    @GET("products")
    suspend fun getProducts():List<Product>
}