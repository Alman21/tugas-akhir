package com.dessapplication.app.modules.editprofileanak.ui

import androidx.activity.viewModels
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseActivity
import com.dessapplication.app.databinding.ActivityEditProfileAnakBinding
import com.dessapplication.app.modules.editprofileanak.`data`.viewmodel.EditProfileAnakVM
import kotlin.String
import kotlin.Unit

class EditProfileAnakActivity :
    BaseActivity<ActivityEditProfileAnakBinding>(R.layout.activity_edit_profile_anak) {
  private val viewModel: EditProfileAnakVM by viewModels<EditProfileAnakVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.editProfileAnakVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "EDIT_PROFILE_ANAK_ACTIVITY"

  }
}
