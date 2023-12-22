package com.dessapplication.app.modules.kontrolorangtua.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dessapplication.app.modules.kontrolorangtua.`data`.model.KontrolOrangTuaModel
import org.koin.core.KoinComponent

class KontrolOrangTuaVM : ViewModel(), KoinComponent {
  val kontrolOrangTuaModel: MutableLiveData<KontrolOrangTuaModel> =
      MutableLiveData(KontrolOrangTuaModel())

  var navArguments: Bundle? = null
}
