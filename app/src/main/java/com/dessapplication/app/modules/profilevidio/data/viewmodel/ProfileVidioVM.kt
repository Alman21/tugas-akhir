package com.dessapplication.app.modules.profilevidio.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dessapplication.app.modules.profilevidio.`data`.model.ProfileVidioModel
import org.koin.core.KoinComponent

class ProfileVidioVM : ViewModel(), KoinComponent {
  val profileVidioModel: MutableLiveData<ProfileVidioModel> = MutableLiveData(ProfileVidioModel())

  var navArguments: Bundle? = null
}
