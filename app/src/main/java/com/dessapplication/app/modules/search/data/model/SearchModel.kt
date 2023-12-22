package com.dessapplication.app.modules.search.`data`.model

import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SearchModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtKeluaranTerbar: String? =
      MyApp.getInstance().resources.getString(R.string.msg_keluaran_terbar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPestaPenulis: String? = MyApp.getInstance().resources.getString(R.string.lbl_pesta_penulis)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMalingKundang: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_maling_kundang)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCerminAjaib: String? = MyApp.getInstance().resources.getString(R.string.lbl_cermin_ajaib)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSyukur: String? = MyApp.getInstance().resources.getString(R.string.lbl_syukur)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSalingMengharg: String? =
      MyApp.getInstance().resources.getString(R.string.msg_saling_mengharg)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAsalUsul: String? = MyApp.getInstance().resources.getString(R.string.lbl_asal_usul)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHomeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSearchTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_search)
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
