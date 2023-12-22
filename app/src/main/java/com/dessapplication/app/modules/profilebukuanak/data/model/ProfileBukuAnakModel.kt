package com.dessapplication.app.modules.profilebukuanak.`data`.model

import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileBukuAnakModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLulu: String? = MyApp.getInstance().resources.getString(R.string.lbl_lulu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUmur5tahun: String? = MyApp.getInstance().resources.getString(R.string.lbl_umur_5_tahun)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProfileLulu: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile_lulu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBUKU: String? = MyApp.getInstance().resources.getString(R.string.lbl_buku)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVIDEO: String? = MyApp.getInstance().resources.getString(R.string.lbl_video)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBOOKMARK: String? = MyApp.getInstance().resources.getString(R.string.lbl_bookmark)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHomeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSearchOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_search)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBook: String? = MyApp.getInstance().resources.getString(R.string.lbl_book)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupEightyEightValue: String? = null
)
