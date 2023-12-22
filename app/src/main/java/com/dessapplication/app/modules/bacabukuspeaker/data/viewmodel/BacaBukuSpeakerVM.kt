package com.dessapplication.app.modules.bacabukuspeaker.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dessapplication.app.modules.bacabukuspeaker.`data`.model.BacaBukuSpeakerModel
import org.koin.core.KoinComponent

class BacaBukuSpeakerVM : ViewModel(), KoinComponent {
  val bacaBukuSpeakerModel: MutableLiveData<BacaBukuSpeakerModel> =
      MutableLiveData(BacaBukuSpeakerModel())

  var navArguments: Bundle? = null
}
