package com.dessapplication.app.modules.profilebukuanak.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dessapplication.app.R
import com.dessapplication.app.databinding.RowListrectanglefortyone1Binding
import com.dessapplication.app.modules.profilebukuanak.`data`.model.Listrectanglefortyone1RowModel
import kotlin.Int
import kotlin.collections.List

class ListrectanglefortyoneAdapter(
  var list: List<Listrectanglefortyone1RowModel>
) : RecyclerView.Adapter<ListrectanglefortyoneAdapter.RowListrectanglefortyone1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectanglefortyone1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectanglefortyone1,parent,false)
    return RowListrectanglefortyone1VH(view)
  }

  override fun onBindViewHolder(holder: RowListrectanglefortyone1VH, position: Int) {
    val listrectanglefortyone1RowModel = Listrectanglefortyone1RowModel()
    // TODO uncomment following line after integration with data source
    // val listrectanglefortyone1RowModel = list[position]
    holder.binding.listrectanglefortyone1RowModel = listrectanglefortyone1RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listrectanglefortyone1RowModel>) {
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
      item: Listrectanglefortyone1RowModel
    ) {
    }
  }

  inner class RowListrectanglefortyone1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectanglefortyone1Binding = RowListrectanglefortyone1Binding.bind(itemView)
    init {
      binding.txtGroupFiftySeven.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, Listrectanglefortyone1RowModel())
      }
    }
  }
}
