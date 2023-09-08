package com.example.recyclerviwe.adapter

import android.content.Context
import android.service.autofill.Dataset
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviwe.R
import com.example.recyclerviwe.data.model.Joke

class ItemAdapter(
    private val context: Context,
    private val dataset: List<Joke>
):RecyclerView.Adapter<ItemViewHolder>(){
    class ItemViewHolder(private val view: View):RecyclerView.ViewHolder(view){

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val joke = dataset[position]
        holder.textView.text = context.resources.getString(joke.stringResource)
    }
}
