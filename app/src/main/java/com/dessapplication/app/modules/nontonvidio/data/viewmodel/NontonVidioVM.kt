package com.dessapplication.app.modules.nontonvidio.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dessapplication.app.modules.nontonvidio.`data`.model.NontonVidioModel
import org.koin.core.KoinComponent

class NontonVidioVM : ViewModel(), KoinComponent {
  val nontonVidioModel: MutableLiveData<NontonVidioModel> = MutableLiveData(NontonVidioModel())

  var navArguments: Bundle? = null
}
