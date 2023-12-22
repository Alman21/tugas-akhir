package com.dessapplication.app.modules.homebuku.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dessapplication.app.modules.homebuku.`data`.model.HomeBukuModel
import org.koin.core.KoinComponent

class HomeBukuVM : ViewModel(), KoinComponent {
  val homeBukuModel: MutableLiveData<HomeBukuModel> = MutableLiveData(HomeBukuModel())

  var navArguments: Bundle? = null
}
