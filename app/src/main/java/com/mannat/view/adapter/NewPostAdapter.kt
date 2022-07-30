package com.mannat.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mannat.databinding.NewPostItemsBinding

class NewPostAdapter(private val context: Context) : RecyclerView.Adapter<NewPostAdapter.ViewHolder>() {
    private lateinit var binding: NewPostItemsBinding

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewPostAdapter.ViewHolder {
        binding = NewPostItemsBinding.inflate(LayoutInflater.from(context), parent, false)
        return ViewHolder(binding.root)
    }

    override fun onBindViewHolder(holder: NewPostAdapter.ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 10
    }
}