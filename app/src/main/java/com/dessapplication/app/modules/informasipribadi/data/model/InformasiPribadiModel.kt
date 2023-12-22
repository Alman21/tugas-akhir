package com.dessapplication.app.modules.informasipribadi.`data`.model

import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class InformasiPribadiModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtInformasiPriba: String? =
      MyApp.getInstance().resources.getString(R.string.msg_informasi_priba2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNama: String? = MyApp.getInstance().resources.getString(R.string.lbl_nama)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNomorHp: String? = MyApp.getInstance().resources.getString(R.string.lbl_nomor_hp)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIDSixtyTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_id_62)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt813857668: String? = MyApp.getInstance().resources.getString(R.string.lbl_813_857_668)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGender: String? = MyApp.getInstance().resources.getString(R.string.lbl_gender)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTanggalLahir: String? = MyApp.getInstance().resources.getString(R.string.lbl_tanggal_lahir)
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
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupTwentyFiveValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupTwentyThreeValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupTwentyFourValue: String? = null
)
