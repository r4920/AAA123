package com.amitsapplication.app.network

import com.amitsapplication.app.network.models.createlist.CreateListRequest
import com.amitsapplication.app.network.models.createlist.CreateListResponse
import kotlin.String
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

interface RetrofitServices {
  @POST("/device/api/v1/user/list")
  suspend fun createList(
    @Header("Content-Type") contentType: String?,
    @Header("Authorization") authorization: String?,
    @Body createListRequest: CreateListRequest?
  ): CreateListResponse
}

const val BASE_URL: String = "https://nodedemo.dhiwise.co"
