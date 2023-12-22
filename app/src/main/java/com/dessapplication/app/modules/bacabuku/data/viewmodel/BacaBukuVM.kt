package com.dessapplication.app.modules.bacabuku.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dessapplication.app.modules.bacabuku.`data`.model.BacaBukuModel
import org.koin.core.KoinComponent

class BacaBukuVM : ViewModel(), KoinComponent {
  val bacaBukuModel: MutableLiveData<BacaBukuModel> = MutableLiveData(BacaBukuModel())

  var navArguments: Bundle? = null
}
