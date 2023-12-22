package com.dessapplication.app.modules.profilebukuanak.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dessapplication.app.modules.profilebukuanak.`data`.model.Listrectanglefortyone1RowModel
import com.dessapplication.app.modules.profilebukuanak.`data`.model.ProfileBukuAnakModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ProfileBukuAnakVM : ViewModel(), KoinComponent {
  val profileBukuAnakModel: MutableLiveData<ProfileBukuAnakModel> =
      MutableLiveData(ProfileBukuAnakModel())

  var navArguments: Bundle? = null

  val listrectanglefortyoneList: MutableLiveData<MutableList<Listrectanglefortyone1RowModel>> =
      MutableLiveData(mutableListOf())
}
