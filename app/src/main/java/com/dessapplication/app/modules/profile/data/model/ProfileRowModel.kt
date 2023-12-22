package com.dessapplication.app.modules.profile.`data`.model

import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLili: String? = MyApp.getInstance().resources.getString(R.string.lbl_lili)

)
