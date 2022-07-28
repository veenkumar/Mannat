package com.mannat.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mannat.databinding.VideoItemsBinding

class AdminPostAdapter(private val context: Context) : RecyclerView.Adapter<AdminPostAdapter.ViewHolder>() {
    private lateinit var binding: VideoItemsBinding

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdminPostAdapter.ViewHolder {
        binding = VideoItemsBinding.inflate(LayoutInflater.from(context), parent, false)
        return ViewHolder(binding.root)
    }

    override fun onBindViewHolder(holder: AdminPostAdapter.ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 10
    }
}