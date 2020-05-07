package com.example.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.itemview.view.*

class Adapter(var outerlist:MutableList<String>,var context : Context):RecyclerView.Adapter<Adapter.ViewHolder>() {


    var innerlist = mutableListOf<String>()

    init {

        innerlist = outerlist


    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.ViewHolder {

        val view = LayoutInflater.from(context).inflate(R.layout.itemview,parent,false)

        return ViewHolder(view)


    }

    override fun getItemCount(): Int = innerlist.size

    override fun onBindViewHolder(holder: Adapter.ViewHolder, position: Int) {

        holder.text.text = innerlist[position]

    }

    inner class ViewHolder(view: View):RecyclerView.ViewHolder(view){

        val text = view.textView

    }

}