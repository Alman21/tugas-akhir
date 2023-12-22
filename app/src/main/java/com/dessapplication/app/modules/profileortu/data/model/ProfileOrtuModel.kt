package com.dessapplication.app.modules.profileortu.`data`.model

import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileOrtuModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNama: String? = MyApp.getInstance().resources.getString(R.string.lbl_nama)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAlamatEmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_alamat_email2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupForty: String? = MyApp.getInstance().resources.getString(R.string.lbl_akun)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProfileOrangtu: String? =
      MyApp.getInstance().resources.getString(R.string.msg_profile_orangtu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtInformasipriba: String? =
      MyApp.getInstance().resources.getString(R.string.msg_informasi_priba)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKataSandi: String? = MyApp.getInstance().resources.getString(R.string.lbl_kata_sandi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKontrolOrangtu: String? =
      MyApp.getInstance().resources.getString(R.string.msg_kontrol_orangtu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_publish_karya)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProfileAnak: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile_anak)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLulu: String? = MyApp.getInstance().resources.getString(R.string.lbl_lulu)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLili: String? = MyApp.getInstance().resources.getString(R.string.lbl_lili)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLogout: String? = MyApp.getInstance().resources.getString(R.string.lbl_logout)
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
