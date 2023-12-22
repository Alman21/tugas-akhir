package com.dessapplication.app.modules.loginpendukung.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dessapplication.app.modules.loginpendukung.`data`.model.LoginPendukungModel
import org.koin.core.KoinComponent

class LoginPendukungVM : ViewModel(), KoinComponent {
  val loginPendukungModel: MutableLiveData<LoginPendukungModel> =
      MutableLiveData(LoginPendukungModel())

  var navArguments: Bundle? = null
}
