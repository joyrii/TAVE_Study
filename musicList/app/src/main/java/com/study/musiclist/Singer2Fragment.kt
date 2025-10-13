package com.study.musiclist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Singer2Fragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_singer2, container, false)

        val items = mutableListOf<String>()
        items.add("시간의 바깥")
        items.add("밤편지")
        items.add("이름에게")
        items.add("가을 아침")
        items.add("내 손을 잡아")
        items.add("마음")
        items.add("스물셋")
        items.add("사랑이 잘")
        items.add("무릎")
        items.add("아이와 나의 바다")
        items.add("나만 몰랐던 이야기")
        items.add("푸르던")

        val rv = view.findViewById<RecyclerView>(R.id.singRV)
        val rvAdapter = RVAdapter(items)

        rv.adapter = rvAdapter
        rv.layoutManager = LinearLayoutManager(context)

        view.findViewById<ImageView>(R.id.image1).setOnClickListener {
            it.findNavController().navigate(R.id.action_singer2Fragment_to_singer1Fragment)
        }

        view.findViewById<ImageView>(R.id.image3).setOnClickListener {
            it.findNavController().navigate(R.id.action_singer2Fragment_to_singer3Fragment)
        }

        return view
    }


}