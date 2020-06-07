package com.makentoshe.androidgithubcitemplate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_recycle_view.*
import kotlinx.android.synthetic.main.row.*

class RecycleViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycle_view)

        val arrayList = ArrayList<Model>()

        arrayList.add(Model("Title", "This is icon for !dead lines! bfhkbhdshfb dbfhsdbvfh gdyhfbdbfs yb ydsfy dsbf dsbf ybsdyfbydbfysdb ybydfb ydybds ybdyfbd yfbsdyfbydsbf ydgfydsfgds bfhkbhdshfb dbfhsdbvfh gdyhfbdbfs yb ydsfy dsbf dsbf ybsdyfbydbfysdb ybydfb ydybds ybdyfbd yfbsdyfbydsbf ydgfydsfgds bfhkbhdshfb dbfhsdbvfh gdyhfbdbfs yb ydsfy dsbf dsbf ybsdyfbydbfysdb ybydfb ydybds ybdyfbd yfbsdyfbydsbf ydgfydsfgds bfhkbhdshfb dbfhsdbvfh gdyhfbdbfs yb ydsfy dsbf dsbf ybsdyfbydbfysdb ybydfb ydybds ybdyfbd yfbsdyfbydsbf ydgfydsfgds bfhkbhdshfb dbfhsdbvfh gdyhfbdbfs yb ydsfy dsbf dsbf ybsdyfbydbfysdb ybydfb ydybds ybdyfbd yfbsdyfbydsbf ydgfydsfgds bfhkbhdshfb dbfhsdbvfh gdyhfbdbfs yb ydsfy dsbf dsbf ybsdyfbydbfysdb ybydfb ydybds ybdyfbd yfbsdyfbydsbf ydgfydsfgds bfhkbhdshfb dbfhsdbvfh gdyhfbdbfs yb ydsfy dsbf dsbf ybsdyfbydbfysdb ybydfb ydybds ybdyfbd yfbsdyfbydsbf ydgfydsfgds bfhkbhdshfb dbfhsdbvfh gdyhfbdbfs yb ydsfy dsbf dsbf ybsdyfbydbfysdb ybydfb ydybds ybdyfbd yfbsdyfbydsbf ydgfydsfgds bfhkbhdshfb dbfhsdbvfh gdyhfbdbfs yb ydsfy dsbf dsbf ybsdyfbydbfysdb ybydfb ydybds ybdyfbd yfbsdyfbydsbf ydgfydsfgds bfhkbhdshfb dbfhsdbvfh gdyhfbdbfs yb ydsfy dsbf dsbf ybsdyfbydbfysdb ybydfb ydybds ybdyfbd yfbsdyfbydsbf ydgfydsfgds bfhkbhdshfb dbfhsdbvfh gdyhfbdbfs yb ydsfy dsbf dsbf ybsdyfbydbfysdb ybydfb ydybds ybdyfbd yfbsdyfbydsbf ydgfydsfgds bfhkbhdshfb dbfhsdbvfh gdyhfbdbfs yb ydsfy dsbf dsbf ybsdyfbydbfysdb ybydfb ydybds ybdyfbd yfbsdyfbydsbf ydgfydsfgds bfhkbhdshfb dbfhsdbvfh gdyhfbdbfs yb ydsfy dsbf dsbf ybsdyfbydbfysdb ybydfb ydybds ybdyfbd yfbsdyfbydsbf ydgfydsfgds bfhkbhdshfb dbfhsdbvfh gdyhfbdbfs yb ydsfy dsbf dsbf ybsdyfbydbfysdb ybydfb ydybds ybdyfbd yfbsdyfbydsbf ydgfydsfgds ", R.drawable.ic_baseline_av_timer_24))
        arrayList.add(Model("Title", "This is icon for !daily routine!", R.drawable.ic_baseline_today_24))
        arrayList.add(Model("Title", "This is icon for !holidays!", R.drawable.ic_baseline_cake_24))
        arrayList.add(Model("Title", "This is icon for !entertainment!", R.drawable.ic_baseline_sports_cricket_24))
        arrayList.add(Model("Title", "This is icon for !meetings!", R.drawable.ic_baseline_people_24))

        val myAdapter = MyAdapter(arrayList,this)

        recyclerview_notes.layoutManager = LinearLayoutManager(this)
        recyclerview_notes.adapter = myAdapter
    }
}