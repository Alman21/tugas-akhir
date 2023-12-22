package com.dessapplication.app.modules.homevidio.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseActivity
import com.dessapplication.app.databinding.ActivityHomeVidioBinding
import com.dessapplication.app.modules.homebukucontainer.ui.HomeBukuContainerActivity
import com.dessapplication.app.modules.homevidio.`data`.viewmodel.HomeVidioVM
import com.dessapplication.app.modules.profilevidio.ui.ProfileVidioActivity
import com.dessapplication.app.modules.rangkumankaryaautorvidio.ui.RangkumanKaryaAutorVidioActivity
import kotlin.String
import kotlin.Unit

class HomeVidioActivity : BaseActivity<ActivityHomeVidioBinding>(R.layout.activity_home_vidio) {
  private val viewModel: HomeVidioVM by viewModels<HomeVidioVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homeVidioVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageRectangleTwentyNine.setOnClickListener {
      val destIntent = ProfileVidioActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleThirtySix.setOnClickListener {
      val destIntent = RangkumanKaryaAutorVidioActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleThirtySeven.setOnClickListener {
      val destIntent = RangkumanKaryaAutorVidioActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleFortyOne.setOnClickListener {
      val destIntent = ProfileVidioActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleThirtyFive.setOnClickListener {
      val destIntent = RangkumanKaryaAutorVidioActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleThirtyTwo.setOnClickListener {
      val destIntent = ProfileVidioActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtBUKU.setOnClickListener {
      val destIntent = HomeBukuContainerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleThirtyThree.setOnClickListener {
      val destIntent = ProfileVidioActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleFortyTwo.setOnClickListener {
      val destIntent = ProfileVidioActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleFortyThree.setOnClickListener {
      val destIntent = ProfileVidioActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "HOME_VIDIO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomeVidioActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
