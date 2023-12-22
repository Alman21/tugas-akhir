package com.dessapplication.app.modules.publishkarya.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dessapplication.app.modules.publishkarya.`data`.model.PublishKaryaModel
import org.koin.core.KoinComponent

class PublishKaryaVM : ViewModel(), KoinComponent {
  val publishKaryaModel: MutableLiveData<PublishKaryaModel> = MutableLiveData(PublishKaryaModel())

  var navArguments: Bundle? = null
}
