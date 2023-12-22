package com.dessapplication.app.modules.nontonvidio.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseActivity
import com.dessapplication.app.databinding.ActivityNontonVidioBinding
import com.dessapplication.app.modules.homevidio.ui.HomeVidioActivity
import com.dessapplication.app.modules.nontonvidio.`data`.viewmodel.NontonVidioVM
import kotlin.String
import kotlin.Unit

class NontonVidioActivity : BaseActivity<ActivityNontonVidioBinding>(R.layout.activity_nonton_vidio)
    {
  private val viewModel: NontonVidioVM by viewModels<NontonVidioVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.nontonVidioVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowOne.setOnClickListener {
      val destIntent = HomeVidioActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "NONTON_VIDIO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NontonVidioActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
