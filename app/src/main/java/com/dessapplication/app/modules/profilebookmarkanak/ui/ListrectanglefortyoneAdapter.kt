package com.dessapplication.app.modules.profilebookmarkanak.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dessapplication.app.R
import com.dessapplication.app.databinding.RowListrectanglefortyone2Binding
import com.dessapplication.app.modules.profilebookmarkanak.`data`.model.Listrectanglefortyone2RowModel
import kotlin.Int
import kotlin.collections.List

class ListrectanglefortyoneAdapter(
  var list: List<Listrectanglefortyone2RowModel>
) : RecyclerView.Adapter<ListrectanglefortyoneAdapter.RowListrectanglefortyone2VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectanglefortyone2VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectanglefortyone2,parent,false)
    return RowListrectanglefortyone2VH(view)
  }

  override fun onBindViewHolder(holder: RowListrectanglefortyone2VH, position: Int) {
    val listrectanglefortyone2RowModel = Listrectanglefortyone2RowModel()
    // TODO uncomment following line after integration with data source
    // val listrectanglefortyone2RowModel = list[position]
    holder.binding.listrectanglefortyone2RowModel = listrectanglefortyone2RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listrectanglefortyone2RowModel>) {
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
      item: Listrectanglefortyone2RowModel
    ) {
    }
  }

  inner class RowListrectanglefortyone2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectanglefortyone2Binding = RowListrectanglefortyone2Binding.bind(itemView)
    init {
      binding.txtGroupFiftySeven.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, Listrectanglefortyone2RowModel())
      }
    }
  }
}
