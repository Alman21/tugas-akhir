package com.dessapplication.app.modules.searchpage.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dessapplication.app.R
import com.dessapplication.app.databinding.RowSearchPageBinding
import com.dessapplication.app.modules.searchpage.`data`.model.SearchPageRowModel
import kotlin.Int
import kotlin.collections.List

class SearchPageAdapter(
  var list: List<SearchPageRowModel>
) : RecyclerView.Adapter<SearchPageAdapter.RowSearchPageVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSearchPageVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_search_page,parent,false)
    return RowSearchPageVH(view)
  }

  override fun onBindViewHolder(holder: RowSearchPageVH, position: Int) {
    val searchPageRowModel = SearchPageRowModel()
    // TODO uncomment following line after integration with data source
    // val searchPageRowModel = list[position]
    holder.binding.searchPageRowModel = searchPageRowModel
  }

  override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<SearchPageRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: SearchPageRowModel
    ) {
    }
  }

  inner class RowSearchPageVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowSearchPageBinding = RowSearchPageBinding.bind(itemView)
    init {
      binding.frameStackfour.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, SearchPageRowModel())
      }
    }
  }
}
