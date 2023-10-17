package com.example.modul22

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.modul22.databinding.ItemListBinding

class MainAdapter(private val list: ArrayList<Users>) : RecyclerView.Adapter<MainAdapter.MAinViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MAinViewHolder {
        return MAinViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MAinViewHolder, position: Int) {
        val data = list[position]
        holder.bind(data)
    }

    class MAinViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        private val binding = ItemListBinding.bind(itemView)
        fun bind(data: Users){
            binding.textView1.text = data.nama
            binding.root.setOnClickListener {
                Toast.makeText(itemView.context, data.nama, Toast.LENGTH_SHORT).show()
            }
        }
    }
}