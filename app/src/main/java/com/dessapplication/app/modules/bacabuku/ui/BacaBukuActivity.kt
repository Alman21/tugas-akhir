package com.dessapplication.app.modules.bacabuku.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseActivity
import com.dessapplication.app.databinding.ActivityBacaBukuBinding
import com.dessapplication.app.modules.bacabuku.`data`.viewmodel.BacaBukuVM
import com.dessapplication.app.modules.bacabukuspeaker.ui.BacaBukuSpeakerActivity
import com.dessapplication.app.modules.profilebuku.ui.ProfileBukuActivity
import kotlin.String
import kotlin.Unit

class BacaBukuActivity : BaseActivity<ActivityBacaBukuBinding>(R.layout.activity_baca_buku) {
  private val viewModel: BacaBukuVM by viewModels<BacaBukuVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.bacaBukuVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnVolumeoff.setOnClickListener {
      val destIntent = BacaBukuSpeakerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowOne.setOnClickListener {
      val destIntent = ProfileBukuActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "BACA_BUKU_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, BacaBukuActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
