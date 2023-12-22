package com.dessapplication.app.modules.profilebuku.`data`.model

import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileBukuModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDongengAnakNu: String? =
      MyApp.getInstance().resources.getString(R.string.msg_dongeng_anak_nu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKaryaxx: String? = MyApp.getInstance().resources.getString(R.string.lbl_karya_xx)
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
  var txtUmur: String? = MyApp.getInstance().resources.getString(R.string.lbl_umur)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTahunCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_7_tahun)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLevelBacaan: String? = MyApp.getInstance().resources.getString(R.string.lbl_level_bacaan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMudah: String? = MyApp.getInstance().resources.getString(R.string.lbl_mudah)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKatagori: String? = MyApp.getInstance().resources.getString(R.string.lbl_katagori)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPengetauanAlam: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_pengetauan_alam)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKataKunci: String? = MyApp.getInstance().resources.getString(R.string.lbl_kata_kunci)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLangitBiruA: String? = MyApp.getInstance().resources.getString(R.string.msg_langit_biru_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDukungPenulis: String? =
      MyApp.getInstance().resources.getString(R.string.msg_dukung_penulis)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? = MyApp.getInstance().resources.getString(R.string.msg_email)

)
