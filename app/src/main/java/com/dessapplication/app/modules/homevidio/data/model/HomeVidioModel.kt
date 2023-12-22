package com.dessapplication.app.modules.homevidio.`data`.model

import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomeVidioModel(
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
  var txtVideodibulan: String? =
      MyApp.getInstance().resources.getString(R.string.msg_video_di_bulan)
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
  var txtVideoyangbaru: String? =
      MyApp.getInstance().resources.getString(R.string.msg_video_yang_baru)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKreatorCosmopo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_kreator_cosmopo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHomeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSearchOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_search)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBook: String? = MyApp.getInstance().resources.getString(R.string.lbl_book)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)

)
