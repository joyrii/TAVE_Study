package com.study.listview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ListViewAdapter(val List : MutableList<ListViewModel>) : BaseAdapter() { //MainActivity에서 연결한 리스트
    override fun getCount(): Int { //아이템 개수
        return List.size //리스트 크기만큼
    }

    override fun getItem(position: Int): Any {
        return List[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView( //데이터를 아이템으로
        position: Int,
        convertView: View?,
        parent: ViewGroup?
    ): View? {
        //listview_item 가져오기
        var convertView = convertView
        if (convertView == null) {
            convertView = LayoutInflater.from(parent?.context).inflate(R.layout.listview_item, parent, false)
        }
        //리스트 값을 하나씩 listviewItem에 넣음
        val title = convertView.findViewById<TextView>(R.id.ListviewItem)
        val content = convertView.findViewById<TextView>(R.id.ListviewItem2)
        //List[0] = ListViewModel("a", "b")
        //List[1] = ListViewModel("c", "d")
        //List[2] = ListViewModel("e", "f")
        title.text = List[position].title
        content.text = List[position].content

        return convertView

    }

}