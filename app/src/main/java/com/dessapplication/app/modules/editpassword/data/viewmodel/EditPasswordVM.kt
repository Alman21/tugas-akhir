package com.dessapplication.app.modules.editpassword.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dessapplication.app.modules.editpassword.`data`.model.EditPasswordModel
import org.koin.core.KoinComponent

class EditPasswordVM : ViewModel(), KoinComponent {
  val editPasswordModel: MutableLiveData<EditPasswordModel> = MutableLiveData(EditPasswordModel())

  var navArguments: Bundle? = null
}
