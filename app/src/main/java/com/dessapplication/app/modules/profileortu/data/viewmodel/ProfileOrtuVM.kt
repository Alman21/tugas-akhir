package com.dessapplication.app.modules.profileortu.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dessapplication.app.modules.profileortu.`data`.model.ProfileOrtuModel
import org.koin.core.KoinComponent

class ProfileOrtuVM : ViewModel(), KoinComponent {
  val profileOrtuModel: MutableLiveData<ProfileOrtuModel> = MutableLiveData(ProfileOrtuModel())

  var navArguments: Bundle? = null
}
