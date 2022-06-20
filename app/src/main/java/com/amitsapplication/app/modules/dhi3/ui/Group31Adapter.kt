package com.amitsapplication.app.modules.dhi3.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.amitsapplication.app.R
import com.amitsapplication.app.databinding.RowGroup31Binding
import com.amitsapplication.app.modules.dhi3.`data`.model.Group31RowModel
import kotlin.Int
import kotlin.collections.List

class Group31Adapter(
  var list: List<Group31RowModel>
) : RecyclerView.Adapter<Group31Adapter.RowGroup31VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowGroup31VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_group31,parent,false)
    return RowGroup31VH(view)
  }

  override fun onBindViewHolder(holder: RowGroup31VH, position: Int) {
    val group31RowModel = Group31RowModel()
    // TODO uncomment following line after integration with data source
    // val group31RowModel = list[position]
    holder.binding.group31RowModel = group31RowModel
  }

  override fun getItemCount(): Int = 7
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Group31RowModel>) {
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
      item: Group31RowModel
    ) {
    }
  }

  inner class RowGroup31VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowGroup31Binding = RowGroup31Binding.bind(itemView)
  }
}
