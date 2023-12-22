package com.dessapplication.app.modules.homebukucontainer.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseActivity
import com.dessapplication.app.databinding.ActivityHomeBukuContainerBinding
import com.dessapplication.app.extensions.loadFragment
import com.dessapplication.app.modules.homebuku.ui.HomeBukuFragment
import com.dessapplication.app.modules.homebukucontainer.`data`.viewmodel.HomeBukuContainerVM
import com.dessapplication.app.modules.profile.ui.ProfileFragment
import com.dessapplication.app.modules.searchpage.ui.SearchPageFragment
import kotlin.String
import kotlin.Unit

class HomeBukuContainerActivity :
    BaseActivity<ActivityHomeBukuContainerBinding>(R.layout.activity_home_buku_container) {
  private val viewModel: HomeBukuContainerVM by viewModels<HomeBukuContainerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.homeBukuContainerVM = viewModel
    val destFragment = HomeBukuFragment.getInstance(null)
    this.loadFragment(
    R.id.fragmentContainer,
    destFragment,
    bundle = destFragment.arguments,
    tag = HomeBukuFragment.TAG,
    addToBackStack = false,
    add = false,
    enter = null,
    exit = null,
    )
  }

  override fun setUpClicks(): Unit {
    binding.linearColumnlock.setOnClickListener {
      val destFragment = ProfileFragment.getInstance(null)
      this.loadFragment(
      R.id.fragmentContainer,
      destFragment,
      bundle = destFragment.arguments,
      tag = ProfileFragment.TAG,
      addToBackStack = true,
      add = false,
      enter = null,
      exit = null,
      )
    }
    binding.linearColumnhome.setOnClickListener {
      val destFragment = HomeBukuFragment.getInstance(null)
      this.loadFragment(
      R.id.fragmentContainer,
      destFragment,
      bundle = destFragment.arguments,
      tag = HomeBukuFragment.TAG,
      addToBackStack = true,
      add = false,
      enter = null,
      exit = null,
      )
    }
    binding.linearColumnsearch.setOnClickListener {
      val destFragment = SearchPageFragment.getInstance(null)
      this.loadFragment(
      R.id.fragmentContainer,
      destFragment,
      bundle = destFragment.arguments,
      tag = SearchPageFragment.TAG,
      addToBackStack = true,
      add = false,
      enter = null,
      exit = null,
      )
    }
  }

  companion object {
    const val TAG: String = "HOME_BUKU_CONTAINER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomeBukuContainerActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
