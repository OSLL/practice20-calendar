package com.makentoshe.androidgithubcitemplate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_recycle_view.*

class RecycleViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycle_view)

        val arrayList = ArrayList<Model>()

        arrayList.add(Model("Black", "This is a black icon for !deadlines!", R.drawable.black))
        arrayList.add(Model("Green", "This is a green icon for !daily routine!", R.drawable.green))
        arrayList.add(Model("Red", "This is a red icon for !holidays!", R.drawable.red))
        arrayList.add(Model("Orange", "This is an orange icon for !entertainment!", R.drawable.orange))
        arrayList.add(Model("Purple", "This is a purple icon for !meetings!", R.drawable.purple))

        val myAdapter = MyAdapter(arrayList,this)

        recyclerview_notes.layoutManager = LinearLayoutManager(this)
        recyclerview_notes.adapter = myAdapter
    }
}