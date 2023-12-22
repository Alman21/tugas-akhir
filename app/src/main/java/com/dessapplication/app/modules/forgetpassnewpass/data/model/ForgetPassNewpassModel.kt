package com.dessapplication.app.modules.forgetpassnewpass.`data`.model

import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ForgetPassNewpassModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBuatKataSandi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_buat_kata_sandi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtJagakeamanana: String? =
      MyApp.getInstance().resources.getString(R.string.msg_jaga_keamanan_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtResetdenganem: String? =
      MyApp.getInstance().resources.getString(R.string.msg_reset_dengan_em)

)
