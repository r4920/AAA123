package com.amitsapplication.app.modules.dhi3.`data`.model

import com.amitsapplication.app.R
import com.amitsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Dhi3Model(
  /**
   * TODO Replace with dynamic value
   */
  var txtPhotos: String? = MyApp.getInstance().resources.getString(R.string.lbl_photos)

)
