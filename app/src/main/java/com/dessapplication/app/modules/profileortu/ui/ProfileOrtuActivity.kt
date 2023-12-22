package com.dessapplication.app.modules.profileortu.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseActivity
import com.dessapplication.app.databinding.ActivityProfileOrtuBinding
import com.dessapplication.app.modules.profileortu.`data`.viewmodel.ProfileOrtuVM
import kotlin.String
import kotlin.Unit

class ProfileOrtuActivity : BaseActivity<ActivityProfileOrtuBinding>(R.layout.activity_profile_ortu)
    {
  private val viewModel: ProfileOrtuVM by viewModels<ProfileOrtuVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.profileOrtuVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "PROFILE_ORTU_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ProfileOrtuActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
