package com.dessapplication.app.modules.bacabukuspeaker.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseActivity
import com.dessapplication.app.databinding.ActivityBacaBukuSpeakerBinding
import com.dessapplication.app.modules.bacabukuspeaker.`data`.viewmodel.BacaBukuSpeakerVM
import com.dessapplication.app.modules.profilebuku.ui.ProfileBukuActivity
import kotlin.String
import kotlin.Unit

class BacaBukuSpeakerActivity :
    BaseActivity<ActivityBacaBukuSpeakerBinding>(R.layout.activity_baca_buku_speaker) {
  private val viewModel: BacaBukuSpeakerVM by viewModels<BacaBukuSpeakerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.bacaBukuSpeakerVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowOne.setOnClickListener {
      val destIntent = ProfileBukuActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "BACA_BUKU_SPEAKER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, BacaBukuSpeakerActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
