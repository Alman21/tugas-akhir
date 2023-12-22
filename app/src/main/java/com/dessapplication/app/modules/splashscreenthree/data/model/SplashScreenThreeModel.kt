package com.dessapplication.app.modules.splashscreenthree.`data`.model

import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SplashScreenThreeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLewati: String? = MyApp.getInstance().resources.getString(R.string.lbl_lewati)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtYukbacabuat: String? = MyApp.getInstance().resources.getString(R.string.msg_yuk_baca_buat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHanyadiCosmob: String? =
      MyApp.getInstance().resources.getString(R.string.msg_hanya_di_cosmob)

)
