package com.dessapplication.app.modules.homevidio.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dessapplication.app.modules.homevidio.`data`.model.HomeVidioModel
import org.koin.core.KoinComponent

class HomeVidioVM : ViewModel(), KoinComponent {
  val homeVidioModel: MutableLiveData<HomeVidioModel> = MutableLiveData(HomeVidioModel())

  var navArguments: Bundle? = null
}
