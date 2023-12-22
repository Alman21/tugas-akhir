package com.dessapplication.app.modules.signin.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dessapplication.app.modules.signin.`data`.model.SigninModel
import org.koin.core.KoinComponent

class SigninVM : ViewModel(), KoinComponent {
  val signinModel: MutableLiveData<SigninModel> = MutableLiveData(SigninModel())

  var navArguments: Bundle? = null
}
