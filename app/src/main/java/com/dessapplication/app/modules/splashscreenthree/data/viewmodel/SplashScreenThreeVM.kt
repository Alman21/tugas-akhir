package com.dessapplication.app.modules.splashscreenthree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dessapplication.app.modules.splashscreenthree.`data`.model.SplashScreenThreeModel
import org.koin.core.KoinComponent

class SplashScreenThreeVM : ViewModel(), KoinComponent {
  val splashScreenThreeModel: MutableLiveData<SplashScreenThreeModel> =
      MutableLiveData(SplashScreenThreeModel())

  var navArguments: Bundle? = null
}
