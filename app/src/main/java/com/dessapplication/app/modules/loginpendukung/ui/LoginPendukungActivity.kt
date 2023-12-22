package com.dessapplication.app.modules.loginpendukung.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseActivity
import com.dessapplication.app.databinding.ActivityLoginPendukungBinding
import com.dessapplication.app.modules.loginpendukung.`data`.viewmodel.LoginPendukungVM
import kotlin.String
import kotlin.Unit

class LoginPendukungActivity :
    BaseActivity<ActivityLoginPendukungBinding>(R.layout.activity_login_pendukung) {
  private val viewModel: LoginPendukungVM by viewModels<LoginPendukungVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loginPendukungVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "LOGIN_PENDUKUNG_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LoginPendukungActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
