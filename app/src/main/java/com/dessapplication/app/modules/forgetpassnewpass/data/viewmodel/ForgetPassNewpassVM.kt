package com.dessapplication.app.modules.forgetpassnewpass.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dessapplication.app.modules.forgetpassnewpass.`data`.model.ForgetPassNewpassModel
import org.koin.core.KoinComponent

class ForgetPassNewpassVM : ViewModel(), KoinComponent {
  val forgetPassNewpassModel: MutableLiveData<ForgetPassNewpassModel> =
      MutableLiveData(ForgetPassNewpassModel())

  var navArguments: Bundle? = null
}
