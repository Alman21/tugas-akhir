package com.dessapplication.app.modules.splashscreenone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dessapplication.app.modules.splashscreenone.`data`.model.SplashScreenOneModel
import org.koin.core.KoinComponent

class SplashScreenOneVM : ViewModel(), KoinComponent {
  val splashScreenOneModel: MutableLiveData<SplashScreenOneModel> =
      MutableLiveData(SplashScreenOneModel())

  var navArguments: Bundle? = null
}
