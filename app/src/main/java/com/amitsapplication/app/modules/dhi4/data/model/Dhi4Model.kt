package com.amitsapplication.app.modules.dhi4.`data`.model

import com.amitsapplication.app.R
import com.amitsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Dhi4Model(
  /**
   * TODO Replace with dynamic value
   */
  var txtTripto: String? = MyApp.getInstance().resources.getString(R.string.lbl_trip_to)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFromAlan: String? = MyApp.getInstance().resources.getString(R.string.lbl_from_alan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGoodmorning: String? = MyApp.getInstance().resources.getString(R.string.lbl_good_morning)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCountry: String? = MyApp.getInstance().resources.getString(R.string.lbl_switzerland)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTheAlps: String? = MyApp.getInstance().resources.getString(R.string.lbl_the_alps)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAgoCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_8_ago)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_11_05)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAm: String? = MyApp.getInstance().resources.getString(R.string.lbl_am)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTocompletethe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_to_complete_the)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAgoCounter1: String? = MyApp.getInstance().resources.getString(R.string.lbl_12_ago)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime1: String? = MyApp.getInstance().resources.getString(R.string.lbl_17_05)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPm: String? = MyApp.getInstance().resources.getString(R.string.lbl_pm)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCountry1: String? = MyApp.getInstance().resources.getString(R.string.msg_go_to_the_large)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPhotos: String? = MyApp.getInstance().resources.getString(R.string.lbl_photos)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCountry2: String? = MyApp.getInstance().resources.getString(R.string.lbl_switzerland)

)
