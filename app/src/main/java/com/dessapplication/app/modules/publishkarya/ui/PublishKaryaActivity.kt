package com.dessapplication.app.modules.publishkarya.ui

import androidx.activity.viewModels
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseActivity
import com.dessapplication.app.databinding.ActivityPublishKaryaBinding
import com.dessapplication.app.modules.publishkarya.`data`.viewmodel.PublishKaryaVM
import kotlin.String
import kotlin.Unit

class PublishKaryaActivity :
    BaseActivity<ActivityPublishKaryaBinding>(R.layout.activity_publish_karya) {
  private val viewModel: PublishKaryaVM by viewModels<PublishKaryaVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.publishKaryaVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "PUBLISH_KARYA_ACTIVITY"

  }
}
