package com.example.aop_part3_chapter7

import retrofit2.Call
import retrofit2.http.GET

interface HouseService {
    @GET("/v3/75054c70-95bd-4ea3-aba7-bd3c02e6fb9b")
    fun getHouseList(): Call<HouseDto>
}