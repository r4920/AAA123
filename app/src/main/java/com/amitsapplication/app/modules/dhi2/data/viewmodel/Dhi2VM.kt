package com.amitsapplication.app.modules.dhi2.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.amitsapplication.app.appcomponents.utility.PreferenceHelper
import com.amitsapplication.app.modules.dhi2.`data`.model.Dhi2Model
import com.amitsapplication.app.network.models.createlist.CreateListRequest
import com.amitsapplication.app.network.models.createlist.CreateListRequestOptions
import com.amitsapplication.app.network.models.createlist.CreateListResponse
import com.amitsapplication.app.network.repository.NetworkRepository
import com.amitsapplication.app.network.resources.Response
import kotlin.Boolean
import kotlinx.coroutines.launch
import org.koin.core.KoinComponent
import org.koin.core.inject

class Dhi2VM : ViewModel(), KoinComponent {
  val dhi2Model: MutableLiveData<Dhi2Model> = MutableLiveData(Dhi2Model())


  var navArguments: Bundle? = null


  val progressLiveData: MutableLiveData<Boolean> = MutableLiveData<Boolean>()

  private val networkRepository: NetworkRepository by inject()

  val createListLiveData: MutableLiveData<Response<CreateListResponse>> =
      MutableLiveData<Response<CreateListResponse>>()

  private val prefs: PreferenceHelper by inject()

  fun callCreateListApi() {
    viewModelScope.launch {
      progressLiveData.postValue(true)
      createListLiveData.postValue(
      networkRepository.createList(
      contentType = """application/json""",
          authorization =
              """Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6IjYxNjUyZjdjMTI0ODc2MDAxNTVjYzY0ZCIsImVtYWlsIjoiUHJpc2NpbGxhX01vaHJAeWFob28uY29tIiwiaWF0IjoxNjM0MDIyNDM4LCJleHAiOjE2MzQ2MjI0Mzh9.YYcCfVOnPA7ZFc-cV90a33_Hycddj-Xtt5kI6IRukxQ""",
          createListRequest = CreateListRequest(
          options = CreateListRequestOptions())
      )
      )
      progressLiveData.postValue(false)
    }
  }

  fun bindCreateListResponse(response: CreateListResponse) {
    val dhi2ModelValue = dhi2Model.value ?:Dhi2Model()
    prefs.setQwq(response.status)
    dhi2Model.value = dhi2ModelValue
  }
}
