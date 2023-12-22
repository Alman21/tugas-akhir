package com.dessapplication.app.modules.profilevidio.`data`.model

import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileVidioModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_anak_cerdas)
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
  var txtJenisVidio: String? = MyApp.getInstance().resources.getString(R.string.lbl_jenis_vidio)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAnimasi: String? = MyApp.getInstance().resources.getString(R.string.lbl_animasi)
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
  var txtDukungAutor: String? = MyApp.getInstance().resources.getString(R.string.lbl_dukung_autor)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? = MyApp.getInstance().resources.getString(R.string.msg_email)

)
