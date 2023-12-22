package com.dessapplication.app.modules.forgetpassverify.`data`.model

import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ForgetPassVerifyModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtVerifikasiKode: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_verifikasi_kode)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMasukkankodee: String? =
      MyApp.getInstance().resources.getString(R.string.msg_masukkan_kode_e)

)
