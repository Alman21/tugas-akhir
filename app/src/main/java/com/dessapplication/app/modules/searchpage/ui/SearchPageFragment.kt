package com.dessapplication.app.modules.searchpage.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.dessapplication.app.R
import com.dessapplication.app.appcomponents.base.BaseFragment
import com.dessapplication.app.databinding.FragmentSearchPageBinding
import com.dessapplication.app.modules.search.ui.SearchActivity
import com.dessapplication.app.modules.searchpage.`data`.model.SearchPageRowModel
import com.dessapplication.app.modules.searchpage.`data`.viewmodel.SearchPageVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SearchPageFragment : BaseFragment<FragmentSearchPageBinding>(R.layout.fragment_search_page) {
  private val viewModel: SearchPageVM by viewModels<SearchPageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val searchPageAdapter = SearchPageAdapter(viewModel.searchPageList.value?:mutableListOf())
    binding.recyclerSearchPage.adapter = searchPageAdapter
    searchPageAdapter.setOnItemClickListener(
    object : SearchPageAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : SearchPageRowModel) {
        onClickRecyclerSearchPage(view, position, item)
      }
    }
    )
    viewModel.searchPageList.observe(requireActivity()) {
      searchPageAdapter.updateData(it)
    }
    binding.searchPageVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerSearchPage(
    view: View,
    position: Int,
    item: SearchPageRowModel
  ): Unit {
    when(view.id) {
      R.id.frameStackfour -> {
        val destIntent = SearchActivity.getIntent(requireActivity(), null)
        startActivity(destIntent)
        requireActivity().onBackPressed()
      }
    }
  }

  companion object {
    const val TAG: String = "SEARCH_PAGE_FRAGMENT"


    fun getInstance(bundle: Bundle?): SearchPageFragment {
      val fragment = SearchPageFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
