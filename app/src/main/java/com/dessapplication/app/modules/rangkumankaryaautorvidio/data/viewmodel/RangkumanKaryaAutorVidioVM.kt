package com.dessapplication.app.modules.rangkumankaryaautorvidio.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dessapplication.app.modules.rangkumankaryaautorvidio.`data`.model.ListrectangletwentynineRowModel
import com.dessapplication.app.modules.rangkumankaryaautorvidio.`data`.model.RangkumanKaryaAutorVidioModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class RangkumanKaryaAutorVidioVM : ViewModel(), KoinComponent {
  val rangkumanKaryaAutorVidioModel: MutableLiveData<RangkumanKaryaAutorVidioModel> =
      MutableLiveData(RangkumanKaryaAutorVidioModel())

  var navArguments: Bundle? = null

  val listrectangletwentynineList: MutableLiveData<MutableList<ListrectangletwentynineRowModel>> =
      MutableLiveData(mutableListOf())
}
