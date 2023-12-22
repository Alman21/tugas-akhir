package com.dessapplication.app.modules.forgetpassemail.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseActivity
import com.dessapplication.app.databinding.ActivityForgetPassEmailBinding
import com.dessapplication.app.modules.forgetpassemail.`data`.viewmodel.ForgetPassEmailVM
import com.dessapplication.app.modules.forgetpassnumber.ui.ForgetPassNumberActivity
import com.dessapplication.app.modules.forgetpassverify.ui.ForgetPassVerifyActivity
import kotlin.String
import kotlin.Unit

class ForgetPassEmailActivity :
    BaseActivity<ActivityForgetPassEmailBinding>(R.layout.activity_forget_pass_email) {
  private val viewModel: ForgetPassEmailVM by viewModels<ForgetPassEmailVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.forgetPassEmailVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnKirimkanKode.setOnClickListener {
      val destIntent = ForgetPassVerifyActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtResetdenganno.setOnClickListener {
      val destIntent = ForgetPassNumberActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FORGET_PASS_EMAIL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ForgetPassEmailActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
