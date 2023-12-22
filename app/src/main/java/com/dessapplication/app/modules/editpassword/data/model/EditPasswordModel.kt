package com.dessapplication.app.modules.editpassword.`data`.model

import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class EditPasswordModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtKataSandi: String? = MyApp.getInstance().resources.getString(R.string.lbl_kata_sandi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKatasandilama: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_kata_sandi_lama)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKatasandibaru: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_kata_sandi_baru)
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
  var etEmailOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPasswordValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPasswordOneValue: String? = null
)
