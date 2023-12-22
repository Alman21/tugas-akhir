package com.dessapplication.app.modules.login.`data`.model

import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LoginModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSelamatDatang: String? =
      MyApp.getInstance().resources.getString(R.string.msg_selamat_datang2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMasukkanemail: String? =
      MyApp.getInstance().resources.getString(R.string.msg_masukkan_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAlamatemail: String? = MyApp.getInstance().resources.getString(R.string.lbl_alamat_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLupaPassword: String? = MyApp.getInstance().resources.getString(R.string.lbl_lupa_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAtau: String? = MyApp.getInstance().resources.getString(R.string.lbl_atau)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBelumPunyaAku: String? =
      MyApp.getInstance().resources.getString(R.string.msg_belum_punya_aku)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupTwentySevenValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPasswordOneValue: String? = null
)
