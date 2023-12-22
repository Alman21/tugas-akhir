package com.dessapplication.app.modules.login.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseActivity
import com.dessapplication.app.databinding.ActivityLoginBinding
import com.dessapplication.app.modules.forgetpassemail.ui.ForgetPassEmailActivity
import com.dessapplication.app.modules.homebukucontainer.ui.HomeBukuContainerActivity
import com.dessapplication.app.modules.login.`data`.viewmodel.LoginVM
import com.dessapplication.app.modules.signin.ui.SigninActivity
import com.dessapplication.app.modules.splashscreen.ui.SplashScreenActivity
import kotlin.String
import kotlin.Unit

class LoginActivity : BaseActivity<ActivityLoginBinding>(R.layout.activity_login) {
  private val viewModel: LoginVM by viewModels<LoginVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.loginVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowOne.setOnClickListener {
      val destIntent = SplashScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnMasuk.setOnClickListener {
      val destIntent = HomeBukuContainerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtBelumPunyaAku.setOnClickListener {
      val destIntent = SigninActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtLupaPassword.setOnClickListener {
      val destIntent = ForgetPassEmailActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "LOGIN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LoginActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
