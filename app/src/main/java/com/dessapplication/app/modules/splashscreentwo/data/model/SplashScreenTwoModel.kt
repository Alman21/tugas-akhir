package com.dessapplication.app.modules.splashscreentwo.`data`.model

import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SplashScreenTwoModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLewati: String? = MyApp.getInstance().resources.getString(R.string.lbl_lewati)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSelamatDatang: String? =
      MyApp.getInstance().resources.getString(R.string.msg_selamat_datang)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCosmobook: String? = MyApp.getInstance().resources.getString(R.string.lbl_cosmobook)

)
