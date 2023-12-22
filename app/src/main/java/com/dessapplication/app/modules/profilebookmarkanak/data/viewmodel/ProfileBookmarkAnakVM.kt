package com.dessapplication.app.modules.profilebookmarkanak.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dessapplication.app.modules.profilebookmarkanak.`data`.model.Listrectanglefortyone2RowModel
import com.dessapplication.app.modules.profilebookmarkanak.`data`.model.ProfileBookmarkAnakModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ProfileBookmarkAnakVM : ViewModel(), KoinComponent {
  val profileBookmarkAnakModel: MutableLiveData<ProfileBookmarkAnakModel> =
      MutableLiveData(ProfileBookmarkAnakModel())

  var navArguments: Bundle? = null

  val listrectanglefortyoneList: MutableLiveData<MutableList<Listrectanglefortyone2RowModel>> =
      MutableLiveData(mutableListOf())
}
