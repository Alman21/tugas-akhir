package com.dessapplication.app.modules.profilebuku.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dessapplication.app.modules.profilebuku.`data`.model.ProfileBukuModel
import org.koin.core.KoinComponent

class ProfileBukuVM : ViewModel(), KoinComponent {
  val profileBukuModel: MutableLiveData<ProfileBukuModel> = MutableLiveData(ProfileBukuModel())

  var navArguments: Bundle? = null
}
