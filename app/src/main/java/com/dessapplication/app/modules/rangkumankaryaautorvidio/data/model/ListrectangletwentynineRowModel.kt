package com.dessapplication.app.modules.rangkumankaryaautorvidio.`data`.model

import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListrectangletwentynineRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAnakCerdas: String? = MyApp.getInstance().resources.getString(R.string.lbl_anak_cerdas2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoremipsumdol: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_dol2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupEighty: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_nonton_sekarang)

)
