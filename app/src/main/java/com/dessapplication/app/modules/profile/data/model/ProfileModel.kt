package com.dessapplication.app.modules.profile.`data`.model

import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ProfileModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtOrangTua: String? = MyApp.getInstance().resources.getString(R.string.lbl_orang_tua)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAkunAnak: String? = MyApp.getInstance().resources.getString(R.string.lbl_akun_anak)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTambahAkunAna: String? =
      MyApp.getInstance().resources.getString(R.string.msg_tambah_akun_ana)

)
