package com.baedev.auth

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_data.view.*

class DataAdapter(
    var datas: List<Data>
) : RecyclerView.Adapter<DataAdapter.DataViewHolder>() {

    inner class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_data, parent, false)
        return DataViewHolder(view)

    }

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.itemView.apply {
            tvTitle.text = datas[position].title
            tvDesc.text = datas[position].desc

        }
    }

    override fun getItemCount(): Int {
        return datas.size
    }
}