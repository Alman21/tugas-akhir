package com.dessapplication.app.modules.forgetpassnumber.`data`.model

import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ForgetPassNumberModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLupaPassword: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_lupa_password2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMasukkanemail: String? =
      MyApp.getInstance().resources.getString(R.string.msg_masukkan_email2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtResetdenganem: String? =
      MyApp.getInstance().resources.getString(R.string.msg_reset_dengan_em)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupFiftySixValue: String? = null
)
