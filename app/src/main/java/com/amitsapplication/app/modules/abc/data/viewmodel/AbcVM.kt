package com.amitsapplication.app.modules.abc.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.amitsapplication.app.modules.abc.`data`.model.AbcModel
import com.amitsapplication.app.modules.abc.`data`.model.SpinnerYourtripsModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class AbcVM : ViewModel(), KoinComponent {
  val abcModel: MutableLiveData<AbcModel> = MutableLiveData(AbcModel())

  var navArguments: Bundle? = null

  val spinnerYourtripsList: MutableLiveData<MutableList<SpinnerYourtripsModel>> = MutableLiveData()
}
