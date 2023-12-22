package com.dessapplication.app.modules.signin.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseActivity
import com.dessapplication.app.databinding.ActivitySigninBinding
import com.dessapplication.app.modules.loginpendukung.ui.LoginPendukungActivity
import com.dessapplication.app.modules.signin.`data`.viewmodel.SigninVM
import kotlin.String
import kotlin.Unit

class SigninActivity : BaseActivity<ActivitySigninBinding>(R.layout.activity_signin) {
  private val viewModel: SigninVM by viewModels<SigninVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.signinVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnDaftar.setOnClickListener {
      val destIntent = LoginPendukungActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SIGNIN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SigninActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
