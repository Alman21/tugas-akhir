package com.dessapplication.app.modules.profilebookmarkanak.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseActivity
import com.dessapplication.app.databinding.ActivityProfileBookmarkAnakBinding
import com.dessapplication.app.modules.profilebookmarkanak.`data`.model.Listrectanglefortyone2RowModel
import com.dessapplication.app.modules.profilebookmarkanak.`data`.viewmodel.ProfileBookmarkAnakVM
import com.dessapplication.app.modules.profilebuku.ui.ProfileBukuActivity
import com.dessapplication.app.modules.profilebukuanak.ui.ProfileBukuAnakActivity
import com.dessapplication.app.modules.profilevidioanak.ui.ProfileVidioAnakActivity
import com.dessapplication.app.modules.splashscreentwo.ui.SplashScreenTwoActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ProfileBookmarkAnakActivity :
    BaseActivity<ActivityProfileBookmarkAnakBinding>(R.layout.activity_profile_bookmark_anak) {
  private val viewModel: ProfileBookmarkAnakVM by viewModels<ProfileBookmarkAnakVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listrectanglefortyoneAdapter =
    ListrectanglefortyoneAdapter(viewModel.listrectanglefortyoneList.value?:mutableListOf())
    binding.recyclerListrectanglefortyone.adapter = listrectanglefortyoneAdapter
    listrectanglefortyoneAdapter.setOnItemClickListener(
    object : ListrectanglefortyoneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      Listrectanglefortyone2RowModel) {
        onClickRecyclerListrectanglefortyone(view, position, item)
      }
    }
    )
    viewModel.listrectanglefortyoneList.observe(this) {
      listrectanglefortyoneAdapter.updateData(it)
    }
    binding.profileBookmarkAnakVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtBUKU.setOnClickListener {
      val destIntent = ProfileBukuAnakActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtVIDEO.setOnClickListener {
      val destIntent = ProfileVidioAnakActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.etGroupEightyEight.setOnClickListener {
      val destIntent = SplashScreenTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListrectanglefortyone(
    view: View,
    position: Int,
    item: Listrectanglefortyone2RowModel
  ): Unit {
    when(view.id) {
      R.id.txtGroupFiftySeven -> {
        val destIntent = ProfileBukuActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "PROFILE_BOOKMARK_ANAK_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ProfileBookmarkAnakActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
