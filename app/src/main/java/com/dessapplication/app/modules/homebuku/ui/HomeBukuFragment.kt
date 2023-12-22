package com.dessapplication.app.modules.homebuku.ui

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseFragment
import com.dessapplication.app.databinding.FragmentHomeBukuBinding
import com.dessapplication.app.modules.homebuku.`data`.viewmodel.HomeBukuVM
import kotlin.String
import kotlin.Unit

class HomeBukuFragment : BaseFragment<FragmentHomeBukuBinding>(R.layout.fragment_home_buku) {
  private val viewModel: HomeBukuVM by viewModels<HomeBukuVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.homeBukuVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "HOME_BUKU_FRAGMENT"


    fun getInstance(bundle: Bundle?): HomeBukuFragment {
      val fragment = HomeBukuFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
