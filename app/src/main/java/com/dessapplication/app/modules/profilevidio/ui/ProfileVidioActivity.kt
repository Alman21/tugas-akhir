package com.dessapplication.app.modules.profilevidio.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseActivity
import com.dessapplication.app.databinding.ActivityProfileVidioBinding
import com.dessapplication.app.modules.nontonvidio.ui.NontonVidioActivity
import com.dessapplication.app.modules.profilevidio.`data`.viewmodel.ProfileVidioVM
import com.dessapplication.app.modules.rangkumankaryaautorvidio.ui.RangkumanKaryaAutorVidioActivity
import kotlin.String
import kotlin.Unit

class ProfileVidioActivity :
    BaseActivity<ActivityProfileVidioBinding>(R.layout.activity_profile_vidio) {
  private val viewModel: ProfileVidioVM by viewModels<ProfileVidioVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.profileVidioVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtKaryaxx.setOnClickListener {
      val destIntent = RangkumanKaryaAutorVidioActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnMulaiMenonton.setOnClickListener {
      val destIntent = NontonVidioActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "PROFILE_VIDIO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ProfileVidioActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
