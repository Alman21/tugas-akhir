package com.dessapplication.app.modules.forgetpassverify.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseActivity
import com.dessapplication.app.databinding.ActivityForgetPassVerifyBinding
import com.dessapplication.app.modules.forgetpassnewpass.ui.ForgetPassNewpassActivity
import com.dessapplication.app.modules.forgetpassverify.`data`.viewmodel.ForgetPassVerifyVM
import kotlin.String
import kotlin.Unit

class ForgetPassVerifyActivity :
    BaseActivity<ActivityForgetPassVerifyBinding>(R.layout.activity_forget_pass_verify) {
  private val viewModel: ForgetPassVerifyVM by viewModels<ForgetPassVerifyVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.forgetPassVerifyVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnSelanjutnya.setOnClickListener {
      val destIntent = ForgetPassNewpassActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FORGET_PASS_VERIFY_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ForgetPassVerifyActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
