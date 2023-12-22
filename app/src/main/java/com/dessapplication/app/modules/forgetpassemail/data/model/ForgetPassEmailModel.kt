package com.dessapplication.app.modules.forgetpassemail.`data`.model

import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ForgetPassEmailModel(
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
  var txtResetdenganno: String? =
      MyApp.getInstance().resources.getString(R.string.msg_reset_dengan_no)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etEmailValue: String? = null
)
