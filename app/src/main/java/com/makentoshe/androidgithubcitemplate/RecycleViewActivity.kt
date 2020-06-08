package com.makentoshe.androidgithubcitemplate

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_recycle_view.*
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class RecycleViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycle_view)

        var intent = intent
        val aDate = intent.getIntExtra("iDate",0)
        val aMonth = intent.getIntExtra("iMonth",0)
        val aYear = intent.getIntExtra("iYear",0)

        // val date: String = SimpleDateFormat("yyyy-MM-dd").format(Date())
        textView.text = "${aDate}.${aMonth}.${aYear}"

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