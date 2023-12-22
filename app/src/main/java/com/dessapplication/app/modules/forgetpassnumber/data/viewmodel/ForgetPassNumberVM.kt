package com.dessapplication.app.modules.forgetpassnumber.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dessapplication.app.modules.forgetpassnumber.`data`.model.ForgetPassNumberModel
import org.koin.core.KoinComponent

class ForgetPassNumberVM : ViewModel(), KoinComponent {
  val forgetPassNumberModel: MutableLiveData<ForgetPassNumberModel> =
      MutableLiveData(ForgetPassNumberModel())

  var navArguments: Bundle? = null
}
