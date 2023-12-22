package com.dessapplication.app.modules.searchpage.`data`.model

import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SearchPageRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtKeluaran: String? = MyApp.getInstance().resources.getString(R.string.lbl_keluaran)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTerbaru: String? = MyApp.getInstance().resources.getString(R.string.lbl_terbaru)

)
