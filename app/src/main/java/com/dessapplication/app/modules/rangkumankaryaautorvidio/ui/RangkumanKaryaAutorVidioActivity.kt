package com.dessapplication.app.modules.rangkumankaryaautorvidio.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseActivity
import com.dessapplication.app.databinding.ActivityRangkumanKaryaAutorVidioBinding
import com.dessapplication.app.modules.profilevidio.ui.ProfileVidioActivity
import com.dessapplication.app.modules.rangkumankaryaautorvidio.`data`.model.ListrectangletwentynineRowModel
import com.dessapplication.app.modules.rangkumankaryaautorvidio.`data`.viewmodel.RangkumanKaryaAutorVidioVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class RangkumanKaryaAutorVidioActivity :
    BaseActivity<ActivityRangkumanKaryaAutorVidioBinding>(R.layout.activity_rangkuman_karya_autor_vidio)
    {
  private val viewModel: RangkumanKaryaAutorVidioVM by viewModels<RangkumanKaryaAutorVidioVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listrectangletwentynineAdapter =
    ListrectangletwentynineAdapter(viewModel.listrectangletwentynineList.value?:mutableListOf())
    binding.recyclerListrectangletwentynine.adapter = listrectangletwentynineAdapter
    listrectangletwentynineAdapter.setOnItemClickListener(
    object : ListrectangletwentynineAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      ListrectangletwentynineRowModel) {
        onClickRecyclerListrectangletwentynine(view, position, item)
      }
    }
    )
    viewModel.listrectangletwentynineList.observe(this) {
      listrectangletwentynineAdapter.updateData(it)
    }
    binding.rangkumanKaryaAutorVidioVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListrectangletwentynine(
    view: View,
    position: Int,
    item: ListrectangletwentynineRowModel
  ): Unit {
    when(view.id) {
      R.id.linearRowrectangletwentynine -> {
        val destIntent = ProfileVidioActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      R.id.txtGroupEighty -> {
        onClickRecyclerListrectangletwentynineTxtGroupEighty(view, position, item)
      }
    }
  }

  fun onClickRecyclerListrectangletwentynineTxtGroupEighty(
    view: View,
    position: Int,
    item: ListrectangletwentynineRowModel
  ): Unit {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 -> {
        val destIntent = ProfileVidioActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      1 -> {
        val destIntent = ProfileVidioActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      2 -> {
        val destIntent = ProfileVidioActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      3 -> {
        val destIntent = ProfileVidioActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      4 -> {
        val destIntent = ProfileVidioActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  companion object {
    const val TAG: String = "RANGKUMAN_KARYA_AUTOR_VIDIO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RangkumanKaryaAutorVidioActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
