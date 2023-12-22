package com.dessapplication.app.modules.profilebuku.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseActivity
import com.dessapplication.app.databinding.ActivityProfileBukuBinding
import com.dessapplication.app.modules.bacabuku.ui.BacaBukuActivity
import com.dessapplication.app.modules.homebukucontainer.ui.HomeBukuContainerActivity
import com.dessapplication.app.modules.profilebuku.`data`.viewmodel.ProfileBukuVM
import com.dessapplication.app.modules.rangkumankaryapenulis.ui.RangkumanKaryaPenulisActivity
import kotlin.String
import kotlin.Unit

class ProfileBukuActivity : BaseActivity<ActivityProfileBukuBinding>(R.layout.activity_profile_buku)
    {
  private val viewModel: ProfileBukuVM by viewModels<ProfileBukuVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.profileBukuVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtKaryaxx.setOnClickListener {
      val destIntent = RangkumanKaryaPenulisActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnMulaiMembaca.setOnClickListener {
      val destIntent = BacaBukuActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowOne.setOnClickListener {
      val destIntent = HomeBukuContainerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "PROFILE_BUKU_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ProfileBukuActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
