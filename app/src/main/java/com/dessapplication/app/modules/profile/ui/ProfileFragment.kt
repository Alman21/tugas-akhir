package com.dessapplication.app.modules.profile.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseFragment
import com.dessapplication.app.databinding.FragmentProfileBinding
import com.dessapplication.app.modules.profile.`data`.model.ProfileRowModel
import com.dessapplication.app.modules.profile.`data`.viewmodel.ProfileVM
import com.dessapplication.app.modules.profilebukuanak.ui.ProfileBukuAnakActivity
import com.dessapplication.app.modules.profileortu.ui.ProfileOrtuActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ProfileFragment : BaseFragment<FragmentProfileBinding>(R.layout.fragment_profile) {
  private val viewModel: ProfileVM by viewModels<ProfileVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val profileAdapter = ProfileAdapter(viewModel.profileList.value?:mutableListOf())
    binding.recyclerProfile.adapter = profileAdapter
    profileAdapter.setOnItemClickListener(
    object : ProfileAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ProfileRowModel) {
        onClickRecyclerProfile(view, position, item)
      }
    }
    )
    viewModel.profileList.observe(requireActivity()) {
      profileAdapter.updateData(it)
    }
    binding.profileVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameStackorangtua.setOnClickListener {
      val destIntent = ProfileOrtuActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
  }

  fun onClickRecyclerProfile(
    view: View,
    position: Int,
    item: ProfileRowModel
  ): Unit {
    when(view.id) {
      R.id.frameStacklili -> {
        onClickRecyclerProfileFrameStacklili(view, position, item)
      }
    }
  }

  fun onClickRecyclerProfileFrameStacklili(
    view: View,
    position: Int,
    item: ProfileRowModel
  ): Unit {
    /** TODO As per your logic, Add constant type for item click.*/
    when(0) {
      0 -> {
        val destIntent = ProfileBukuAnakActivity.getIntent(requireActivity(), null)
        startActivity(destIntent)
        requireActivity().onBackPressed()
      }
      1 -> {
        val destIntent = ProfileBukuAnakActivity.getIntent(requireActivity(), null)
        startActivity(destIntent)
        requireActivity().onBackPressed()
      }
    }
  }

  companion object {
    const val TAG: String = "PROFILE_FRAGMENT"


    fun getInstance(bundle: Bundle?): ProfileFragment {
      val fragment = ProfileFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
