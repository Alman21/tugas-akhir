package com.dessapplication.app.modules.rangkumankaryaautorvidio.`data`.model

import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class RangkumanKaryaAutorVidioModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtKaryaxx: String? = MyApp.getInstance().resources.getString(R.string.lbl_karya_xx)

)
