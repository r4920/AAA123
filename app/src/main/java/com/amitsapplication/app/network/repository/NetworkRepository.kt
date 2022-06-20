package com.amitsapplication.app.network.repository

import com.amitsapplication.app.R
import com.amitsapplication.app.appcomponents.di.MyApp
import com.amitsapplication.app.extensions.NoInternetConnection
import com.amitsapplication.app.extensions.isOnline
import com.amitsapplication.app.network.RetrofitServices
import com.amitsapplication.app.network.models.createlist.CreateListRequest
import com.amitsapplication.app.network.models.createlist.CreateListResponse
import com.amitsapplication.app.network.resources.ErrorResponse
import com.amitsapplication.app.network.resources.Response
import com.amitsapplication.app.network.resources.SuccessResponse
import java.lang.Exception
import kotlin.String
import org.koin.core.KoinComponent
import org.koin.core.inject

class NetworkRepository : KoinComponent {
  private val retrofitServices: RetrofitServices by inject()

  private val errorMessage: String = "Something went wrong."

  suspend fun createList(
    contentType: String?,
    authorization: String?,
    createListRequest: CreateListRequest?
  ): Response<CreateListResponse> = try {
    val isOnline = MyApp.getInstance().isOnline()
    if(isOnline) {
      SuccessResponse(retrofitServices.createList(contentType, authorization, createListRequest))
    } else {
      val internetException =
          NoInternetConnection(MyApp.getInstance().getString(R.string.no_internet_connection))
      ErrorResponse(internetException.message ?:errorMessage, internetException)
    }
  } catch(e:Exception) {
    e.printStackTrace()
    ErrorResponse(e.message ?:errorMessage, e)
  }
}
