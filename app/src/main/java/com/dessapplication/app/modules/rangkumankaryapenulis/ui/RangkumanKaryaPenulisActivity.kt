package com.dessapplication.app.modules.rangkumankaryapenulis.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseActivity
import com.dessapplication.app.databinding.ActivityRangkumanKaryaPenulisBinding
import com.dessapplication.app.modules.homebukucontainer.ui.HomeBukuContainerActivity
import com.dessapplication.app.modules.profilebuku.ui.ProfileBukuActivity
import com.dessapplication.app.modules.rangkumankaryapenulis.`data`.model.ListrectanglefortyoneRowModel
import com.dessapplication.app.modules.rangkumankaryapenulis.`data`.viewmodel.RangkumanKaryaPenulisVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class RangkumanKaryaPenulisActivity :
    BaseActivity<ActivityRangkumanKaryaPenulisBinding>(R.layout.activity_rangkuman_karya_penulis) {
  private val viewModel: RangkumanKaryaPenulisVM by viewModels<RangkumanKaryaPenulisVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listrectanglefortyoneAdapter =
    ListrectanglefortyoneAdapter(viewModel.listrectanglefortyoneList.value?:mutableListOf())
    binding.recyclerListrectanglefortyone.adapter = listrectanglefortyoneAdapter
    listrectanglefortyoneAdapter.setOnItemClickListener(
    object : ListrectanglefortyoneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      ListrectanglefortyoneRowModel) {
        onClickRecyclerListrectanglefortyone(view, position, item)
      }
    }
    )
    viewModel.listrectanglefortyoneList.observe(this) {
      listrectanglefortyoneAdapter.updateData(it)
    }
    binding.rangkumanKaryaPenulisVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowOne.setOnClickListener {
      val destIntent = HomeBukuContainerActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListrectanglefortyone(
    view: View,
    position: Int,
    item: ListrectanglefortyoneRowModel
  ): Unit {
    when(view.id) {
      R.id.txtGroupFiftySeven -> {
        onClickRecyclerListrectanglefortyoneTxtGroupFiftySeven(view, position, item)
      }
    }
  }

  fun onClickRecyclerListrectanglefortyoneTxtGroupFiftySeven(
    view: View,
    position: Int,
    item: ListrectanglefortyoneRowModel
  ): Unit {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 -> {
        val destIntent = ProfileBukuActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      1 -> {
        val destIntent = ProfileBukuActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      2 -> {
        val destIntent = ProfileBukuActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      3 -> {
        val destIntent = ProfileBukuActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      4 -> {
        val destIntent = ProfileBukuActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "RANGKUMAN_KARYA_PENULIS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RangkumanKaryaPenulisActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
