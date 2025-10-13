package com.study.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RVAdapter(val items : MutableList<String>) : RecyclerView.Adapter<RVAdapter.ViewHolder>() {

    //RV 아이템 가져오기
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RVAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_item, parent, false)
        return ViewHolder(view)
    }

    interface ItemClick {
        fun oncClick(view: View, position: Int)
    }
    var itemClick : ItemClick? = null

    //ViewHolder에 바인딩 (item에 넣어서 RV에 전달): 뷰 바인딩
    override fun onBindViewHolder(holder: RVAdapter.ViewHolder, position: Int) {
        if (itemClick != null) {
            holder.itemView.setOnClickListener { v ->
                itemClick?.oncClick(v, position)
            }
        }
        holder.bindItems(items[position]) //이게
    }

    //전체 RV 개수
    override fun getItemCount(): Int {
        return items.size
    }

    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(item : String) { //여기
            val rv_text = itemView.findViewById<TextView>(R.id.rvItem)
            rv_text.text = item
        }

    }

}