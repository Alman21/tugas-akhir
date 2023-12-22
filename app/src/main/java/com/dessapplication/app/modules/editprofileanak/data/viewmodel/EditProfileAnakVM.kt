package com.dessapplication.app.modules.editprofileanak.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dessapplication.app.modules.editprofileanak.`data`.model.EditProfileAnakModel
import org.koin.core.KoinComponent

class EditProfileAnakVM : ViewModel(), KoinComponent {
  val editProfileAnakModel: MutableLiveData<EditProfileAnakModel> =
      MutableLiveData(EditProfileAnakModel())

  var navArguments: Bundle? = null
}
