package com.dessapplication.app.modules.homebuku.`data`.model

import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomeBukuModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHaiLulu: String? = MyApp.getInstance().resources.getString(R.string.lbl_hai_lulu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBUKU: String? = MyApp.getInstance().resources.getString(R.string.lbl_buku)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVIDEO: String? = MyApp.getInstance().resources.getString(R.string.lbl_video)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMembacadibula: String? =
      MyApp.getInstance().resources.getString(R.string.msg_membaca_di_bula)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBukubaruTerbi: String? =
      MyApp.getInstance().resources.getString(R.string.msg_buku_baru_terbi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBukuyangbaru: String? =
      MyApp.getInstance().resources.getString(R.string.msg_buku_yang_baru)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_kreator_cosmop)

)
