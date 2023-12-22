package com.dessapplication.app.modules.editpassword.ui

import androidx.activity.viewModels
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseActivity
import com.dessapplication.app.databinding.ActivityEditPasswordBinding
import com.dessapplication.app.modules.editpassword.`data`.viewmodel.EditPasswordVM
import kotlin.String
import kotlin.Unit

class EditPasswordActivity :
    BaseActivity<ActivityEditPasswordBinding>(R.layout.activity_edit_password) {
  private val viewModel: EditPasswordVM by viewModels<EditPasswordVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.editPasswordVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "EDIT_PASSWORD_ACTIVITY"

  }
}
