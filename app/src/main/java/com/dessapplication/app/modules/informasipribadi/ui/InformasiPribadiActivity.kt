package com.dessapplication.app.modules.informasipribadi.ui

import androidx.activity.viewModels
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseActivity
import com.dessapplication.app.databinding.ActivityInformasiPribadiBinding
import com.dessapplication.app.modules.informasipribadi.`data`.viewmodel.InformasiPribadiVM
import kotlin.String
import kotlin.Unit

class InformasiPribadiActivity :
    BaseActivity<ActivityInformasiPribadiBinding>(R.layout.activity_informasi_pribadi) {
  private val viewModel: InformasiPribadiVM by viewModels<InformasiPribadiVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.informasiPribadiVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "INFORMASI_PRIBADI_ACTIVITY"

  }
}
