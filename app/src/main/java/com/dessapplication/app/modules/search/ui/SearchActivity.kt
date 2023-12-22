package com.dessapplication.app.modules.search.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseActivity
import com.dessapplication.app.databinding.ActivitySearchBinding
import com.dessapplication.app.modules.profilebuku.ui.ProfileBukuActivity
import com.dessapplication.app.modules.search.`data`.viewmodel.SearchVM
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

class SearchActivity : BaseActivity<ActivitySearchBinding>(R.layout.activity_search) {
  private val viewModel: SearchVM by viewModels<SearchVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.searchVM = viewModel
    setUpSearchViewGroupThirtyOneListener()
  }

  override fun setUpClicks(): Unit {
    binding.imageRectangleThirty.setOnClickListener {
      val destIntent = ProfileBukuActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleTwentyNine.setOnClickListener {
      val destIntent = ProfileBukuActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleThirtyTwo.setOnClickListener {
      val destIntent = ProfileBukuActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleThirtyOne.setOnClickListener {
      val destIntent = ProfileBukuActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleThirtyThree.setOnClickListener {
      val destIntent = ProfileBukuActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageRectangleThirtyFour.setOnClickListener {
      val destIntent = ProfileBukuActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  private fun setUpSearchViewGroupThirtyOneListener(): Unit {
    binding.searchViewGroupThirtyOne.setOnQueryTextListener(object :
    SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    companion object {
      const val TAG: String = "SEARCH_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, SearchActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
