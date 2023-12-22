package com.dessapplication.app.modules.splashscreentwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseActivity
import com.dessapplication.app.databinding.ActivitySplashScreenTwoBinding
import com.dessapplication.app.modules.splashscreen.ui.SplashScreenActivity
import com.dessapplication.app.modules.splashscreenthree.ui.SplashScreenThreeActivity
import com.dessapplication.app.modules.splashscreentwo.`data`.viewmodel.SplashScreenTwoVM
import kotlin.String
import kotlin.Unit

class SplashScreenTwoActivity :
    BaseActivity<ActivitySplashScreenTwoBinding>(R.layout.activity_splash_screen_two) {
  private val viewModel: SplashScreenTwoVM by viewModels<SplashScreenTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.splashScreenTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtLewati.setOnClickListener {
      val destIntent = SplashScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnBerikutnya.setOnClickListener {
      val destIntent = SplashScreenThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SPLASH_SCREEN_TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SplashScreenTwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
