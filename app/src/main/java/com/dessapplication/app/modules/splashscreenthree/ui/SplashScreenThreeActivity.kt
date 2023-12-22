package com.dessapplication.app.modules.splashscreenthree.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseActivity
import com.dessapplication.app.databinding.ActivitySplashScreenThreeBinding
import com.dessapplication.app.modules.splashscreen.ui.SplashScreenActivity
import com.dessapplication.app.modules.splashscreenthree.`data`.viewmodel.SplashScreenThreeVM
import kotlin.String
import kotlin.Unit

class SplashScreenThreeActivity :
    BaseActivity<ActivitySplashScreenThreeBinding>(R.layout.activity_splash_screen_three) {
  private val viewModel: SplashScreenThreeVM by viewModels<SplashScreenThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.splashScreenThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnBerikutnya.setOnClickListener {
      val destIntent = SplashScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtLewati.setOnClickListener {
      val destIntent = SplashScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "SPLASH_SCREEN_THREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SplashScreenThreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
