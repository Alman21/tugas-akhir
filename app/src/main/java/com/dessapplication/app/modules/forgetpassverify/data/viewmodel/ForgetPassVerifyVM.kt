package com.dessapplication.app.modules.forgetpassverify.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dessapplication.app.modules.forgetpassverify.`data`.model.ForgetPassVerifyModel
import org.koin.core.KoinComponent

class ForgetPassVerifyVM : ViewModel(), KoinComponent {
  val forgetPassVerifyModel: MutableLiveData<ForgetPassVerifyModel> =
      MutableLiveData(ForgetPassVerifyModel())

  var navArguments: Bundle? = null
}
