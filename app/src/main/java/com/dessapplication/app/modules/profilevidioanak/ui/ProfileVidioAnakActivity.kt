package com.dessapplication.app.modules.profilevidioanak.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseActivity
import com.dessapplication.app.databinding.ActivityProfileVidioAnakBinding
import com.dessapplication.app.modules.nontonvidio.ui.NontonVidioActivity
import com.dessapplication.app.modules.profilebookmarkanak.ui.ProfileBookmarkAnakActivity
import com.dessapplication.app.modules.profilebukuanak.ui.ProfileBukuAnakActivity
import com.dessapplication.app.modules.profilevidioanak.`data`.model.Listrectangletwentynine1RowModel
import com.dessapplication.app.modules.profilevidioanak.`data`.viewmodel.ProfileVidioAnakVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ProfileVidioAnakActivity :
    BaseActivity<ActivityProfileVidioAnakBinding>(R.layout.activity_profile_vidio_anak) {
  private val viewModel: ProfileVidioAnakVM by viewModels<ProfileVidioAnakVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listrectangletwentynineAdapter =
    ListrectangletwentynineAdapter(viewModel.listrectangletwentynineList.value?:mutableListOf())
    binding.recyclerListrectangletwentynine.adapter = listrectangletwentynineAdapter
    listrectangletwentynineAdapter.setOnItemClickListener(
    object : ListrectangletwentynineAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      Listrectangletwentynine1RowModel) {
        onClickRecyclerListrectangletwentynine(view, position, item)
      }
    }
    )
    viewModel.listrectangletwentynineList.observe(this) {
      listrectangletwentynineAdapter.updateData(it)
    }
    binding.profileVidioAnakVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtBUKU.setOnClickListener {
      val destIntent = ProfileBukuAnakActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtBOOKMARK.setOnClickListener {
      val destIntent = ProfileBookmarkAnakActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListrectangletwentynine(
    view: View,
    position: Int,
    item: Listrectangletwentynine1RowModel
  ): Unit {
    when(view.id) {
      R.id.txtGroupEighty ->  {
        val destIntent = NontonVidioActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "PROFILE_VIDIO_ANAK_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ProfileVidioAnakActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
