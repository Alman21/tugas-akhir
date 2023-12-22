package com.dessapplication.app.modules.informasipribadi.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dessapplication.app.modules.informasipribadi.`data`.model.InformasiPribadiModel
import org.koin.core.KoinComponent

class InformasiPribadiVM : ViewModel(), KoinComponent {
  val informasiPribadiModel: MutableLiveData<InformasiPribadiModel> =
      MutableLiveData(InformasiPribadiModel())

  var navArguments: Bundle? = null
}
