package com.dessapplication.app.modules.homebukucontainer.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dessapplication.app.modules.homebukucontainer.`data`.model.HomeBukuContainerModel
import org.koin.core.KoinComponent

class HomeBukuContainerVM : ViewModel(), KoinComponent {
  val homeBukuContainerModel: MutableLiveData<HomeBukuContainerModel> =
      MutableLiveData(HomeBukuContainerModel())

  var navArguments: Bundle? = null
}
