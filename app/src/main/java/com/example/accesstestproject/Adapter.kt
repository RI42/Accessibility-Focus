package com.example.accesstestproject

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.accesstestproject.databinding.ItemBinding

class Adapter : ListAdapter<String, Adapter.ViewH>(Df) {

    object Df : DiffUtil.ItemCallback<String>() {
        override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
            return oldItem == newItem
        }

    }

    class ViewH(val bind: ItemBinding) : RecyclerView.ViewHolder(bind.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewH {

        return ViewH(ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ViewH, position: Int) {

        holder.bind.root.findViewById<TextView>(R.id.tv).text = getItem(position)
        holder.bind.root.setOnClickListener {
            App.INSTANCE.router.navigateTo(Screens.Oper())
        }

    }
}