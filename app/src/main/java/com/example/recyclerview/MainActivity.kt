package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val ct = this

    val list = mutableListOf<Int>()

    val adapter = Adapter(list,ct)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       setlist(list)

       setUpRecyclerView(rv,adapter)

       adapter.update(list)

    }

    fun setUpRecyclerView(recyclerView: RecyclerView,adapter: Adapter){

        recyclerView.layoutManager = LinearLayoutManager(ct)

        recyclerView.adapter = adapter

        val dr = DividerItemDecoration()

        recyclerView.addItemDecoration(dr)

    }

    fun setlist(list: MutableList<Int>){

        for(i in 1 .. 250)  list.add(i)

    }

}
