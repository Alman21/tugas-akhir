package com.dessapplication.app.modules.profilevidioanak.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dessapplication.app.modules.profilevidioanak.`data`.model.Listrectangletwentynine1RowModel
import com.dessapplication.app.modules.profilevidioanak.`data`.model.ProfileVidioAnakModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ProfileVidioAnakVM : ViewModel(), KoinComponent {
  val profileVidioAnakModel: MutableLiveData<ProfileVidioAnakModel> =
      MutableLiveData(ProfileVidioAnakModel())

  var navArguments: Bundle? = null

  val listrectangletwentynineList: MutableLiveData<MutableList<Listrectangletwentynine1RowModel>> =
      MutableLiveData(mutableListOf())
}
