package com.dessapplication.app.modules.profilebukuanak.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseActivity
import com.dessapplication.app.databinding.ActivityProfileBukuAnakBinding
import com.dessapplication.app.modules.profilebookmarkanak.ui.ProfileBookmarkAnakActivity
import com.dessapplication.app.modules.profilebuku.ui.ProfileBukuActivity
import com.dessapplication.app.modules.profilebukuanak.`data`.model.Listrectanglefortyone1RowModel
import com.dessapplication.app.modules.profilebukuanak.`data`.viewmodel.ProfileBukuAnakVM
import com.dessapplication.app.modules.profilevidioanak.ui.ProfileVidioAnakActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ProfileBukuAnakActivity :
    BaseActivity<ActivityProfileBukuAnakBinding>(R.layout.activity_profile_buku_anak) {
  private val viewModel: ProfileBukuAnakVM by viewModels<ProfileBukuAnakVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listrectanglefortyoneAdapter =
    ListrectanglefortyoneAdapter(viewModel.listrectanglefortyoneList.value?:mutableListOf())
    binding.recyclerListrectanglefortyone.adapter = listrectanglefortyoneAdapter
    listrectanglefortyoneAdapter.setOnItemClickListener(
    object : ListrectanglefortyoneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      Listrectanglefortyone1RowModel) {
        onClickRecyclerListrectanglefortyone(view, position, item)
      }
    }
    )
    viewModel.listrectanglefortyoneList.observe(this) {
      listrectanglefortyoneAdapter.updateData(it)
    }
    binding.profileBukuAnakVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtVIDEO.setOnClickListener {
      val destIntent = ProfileVidioAnakActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtBOOKMARK.setOnClickListener {
      val destIntent = ProfileBookmarkAnakActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListrectanglefortyone(
    view: View,
    position: Int,
    item: Listrectanglefortyone1RowModel
  ): Unit {
    when(view.id) {
      R.id.txtGroupFiftySeven -> {
        val destIntent = ProfileBukuActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "PROFILE_BUKU_ANAK_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ProfileBukuAnakActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
