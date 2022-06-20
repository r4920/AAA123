package com.amitsapplication.app.modules.dhi3.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.amitsapplication.app.modules.dhi3.`data`.model.Dhi3Model
import com.amitsapplication.app.modules.dhi3.`data`.model.Group31RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class Dhi3VM : ViewModel(), KoinComponent {
  val dhi3Model: MutableLiveData<Dhi3Model> = MutableLiveData(Dhi3Model())

  var navArguments: Bundle? = null

  val group31List: MutableLiveData<MutableList<Group31RowModel>> = MutableLiveData(mutableListOf())
}
