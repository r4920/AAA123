package com.amitsapplication.app.modules.abc.`data`.model

import com.amitsapplication.app.R
import com.amitsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AbcModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGroup68: String? = MyApp.getInstance().resources.getString(R.string.lbl_button)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTrack: String? = MyApp.getInstance().resources.getString(R.string.lbl_track)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcode: String? = MyApp.getInstance().resources.getString(R.string.lbl_2022)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcode1: String? = MyApp.getInstance().resources.getString(R.string.lbl_2021)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCountry: String? = MyApp.getInstance().resources.getString(R.string.lbl_switzerland)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcode2: String? = MyApp.getInstance().resources.getString(R.string.lbl_2020)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCountry1: String? = MyApp.getInstance().resources.getString(R.string.lbl_germany)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCountry2: String? = MyApp.getInstance().resources.getString(R.string.lbl_iceland)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddtrip: String? = MyApp.getInstance().resources.getString(R.string.lbl_add_trip)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroup74Value: String? = null
)
