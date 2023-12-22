package com.dessapplication.app.modules.forgetpassnumber.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseActivity
import com.dessapplication.app.databinding.ActivityForgetPassNumberBinding
import com.dessapplication.app.modules.forgetpassemail.ui.ForgetPassEmailActivity
import com.dessapplication.app.modules.forgetpassnumber.`data`.viewmodel.ForgetPassNumberVM
import com.dessapplication.app.modules.forgetpassverify.ui.ForgetPassVerifyActivity
import kotlin.String
import kotlin.Unit

class ForgetPassNumberActivity :
    BaseActivity<ActivityForgetPassNumberBinding>(R.layout.activity_forget_pass_number) {
  private val viewModel: ForgetPassNumberVM by viewModels<ForgetPassNumberVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.forgetPassNumberVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtResetdenganem.setOnClickListener {
      val destIntent = ForgetPassEmailActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnKirimkanKode.setOnClickListener {
      val destIntent = ForgetPassVerifyActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FORGET_PASS_NUMBER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ForgetPassNumberActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
