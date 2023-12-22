package com.dessapplication.app.modules.rangkumankaryaautorvidio.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dessapplication.app.R
import com.dessapplication.app.databinding.RowListrectangletwentynineBinding
import com.dessapplication.app.modules.rangkumankaryaautorvidio.`data`.model.ListrectangletwentynineRowModel
import kotlin.Int
import kotlin.collections.List

class ListrectangletwentynineAdapter(
  var list: List<ListrectangletwentynineRowModel>
) : RecyclerView.Adapter<ListrectangletwentynineAdapter.RowListrectangletwentynineVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListrectangletwentynineVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listrectangletwentynine,parent,false)
    return RowListrectangletwentynineVH(view)
  }

  override fun onBindViewHolder(holder: RowListrectangletwentynineVH, position: Int) {
    val listrectangletwentynineRowModel = ListrectangletwentynineRowModel()
    // TODO uncomment following line after integration with data source
    // val listrectangletwentynineRowModel = list[position]
    holder.binding.listrectangletwentynineRowModel = listrectangletwentynineRowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListrectangletwentynineRowModel>) {
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
      item: ListrectangletwentynineRowModel
    ) {
    }
  }

  inner class RowListrectangletwentynineVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListrectangletwentynineBinding =
        RowListrectangletwentynineBinding.bind(itemView)
    init {
      binding.txtGroupEighty.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListrectangletwentynineRowModel())
      }
      binding.linearRowrectangletwentynine.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListrectangletwentynineRowModel())
      }
    }
  }
}
