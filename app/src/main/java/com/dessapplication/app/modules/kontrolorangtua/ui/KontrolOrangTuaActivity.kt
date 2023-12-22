package com.dessapplication.app.modules.kontrolorangtua.ui

import androidx.activity.viewModels
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseActivity
import com.dessapplication.app.databinding.ActivityKontrolOrangTuaBinding
import com.dessapplication.app.modules.kontrolorangtua.`data`.viewmodel.KontrolOrangTuaVM
import kotlin.String
import kotlin.Unit

class KontrolOrangTuaActivity :
    BaseActivity<ActivityKontrolOrangTuaBinding>(R.layout.activity_kontrol_orang_tua) {
  private val viewModel: KontrolOrangTuaVM by viewModels<KontrolOrangTuaVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.kontrolOrangTuaVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "KONTROL_ORANG_TUA_ACTIVITY"

  }
}
