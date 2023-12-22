package com.dessapplication.app.modules.signin.`data`.model

import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SigninModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBuatAkun: String? = MyApp.getInstance().resources.getString(R.string.lbl_buat_akun)
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
  var txtSetujusyarat: String? = MyApp.getInstance().resources.getString(R.string.msg_setuju_syarat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAtau: String? = MyApp.getInstance().resources.getString(R.string.lbl_atau2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDaftardenganG: String? =
      MyApp.getInstance().resources.getString(R.string.msg_daftar_dengan_g)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupFifteenValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPasswordOneValue: String? = null
)
