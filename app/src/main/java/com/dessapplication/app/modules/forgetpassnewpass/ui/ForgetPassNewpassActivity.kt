package com.dessapplication.app.modules.forgetpassnewpass.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseActivity
import com.dessapplication.app.databinding.ActivityForgetPassNewpassBinding
import com.dessapplication.app.modules.forgetpassnewpass.`data`.viewmodel.ForgetPassNewpassVM
import com.dessapplication.app.modules.login.ui.LoginActivity
import kotlin.String
import kotlin.Unit

class ForgetPassNewpassActivity :
    BaseActivity<ActivityForgetPassNewpassBinding>(R.layout.activity_forget_pass_newpass) {
  private val viewModel: ForgetPassNewpassVM by viewModels<ForgetPassNewpassVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.forgetPassNewpassVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnAturUlangSandiOne.setOnClickListener {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FORGET_PASS_NEWPASS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ForgetPassNewpassActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
