package com.dessapplication.app.modules.publishkarya.`data`.model

import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PublishKaryaModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtKontakKami: String? = MyApp.getInstance().resources.getString(R.string.lbl_kontak_kami)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWhatsApp: String? = MyApp.getInstance().resources.getString(R.string.lbl_whatsapp)

)
