package com.dessapplication.app.modules.editprofileanak.`data`.model

import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class EditProfileAnakModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtUmurAnak: String? = MyApp.getInstance().resources.getString(R.string.lbl_umur_anak)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupSeventeen: String? = MyApp.getInstance().resources.getString(R.string.lbl_6)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupEighteen: String? = MyApp.getInstance().resources.getString(R.string.lbl_7)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupSeventeenOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_8)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGender: String? = MyApp.getInstance().resources.getString(R.string.lbl_gender)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAvatar: String? = MyApp.getInstance().resources.getString(R.string.lbl_avatar)

)
