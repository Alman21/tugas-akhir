package com.dessapplication.app.modules.rangkumankaryapenulis.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dessapplication.app.modules.rangkumankaryapenulis.`data`.model.ListrectanglefortyoneRowModel
import com.dessapplication.app.modules.rangkumankaryapenulis.`data`.model.RangkumanKaryaPenulisModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class RangkumanKaryaPenulisVM : ViewModel(), KoinComponent {
  val rangkumanKaryaPenulisModel: MutableLiveData<RangkumanKaryaPenulisModel> =
      MutableLiveData(RangkumanKaryaPenulisModel())

  var navArguments: Bundle? = null

  val listrectanglefortyoneList: MutableLiveData<MutableList<ListrectanglefortyoneRowModel>> =
      MutableLiveData(mutableListOf())
}
