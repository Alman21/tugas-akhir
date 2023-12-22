package com.dessapplication.app.modules.profilebookmarkanak.`data`.model

import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Listrectanglefortyone2RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_langit_biru)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKaryaWulan: String? = MyApp.getInstance().resources.getString(R.string.lbl_karya_wulan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupFiftySeven: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_baca_sekarang)

)
