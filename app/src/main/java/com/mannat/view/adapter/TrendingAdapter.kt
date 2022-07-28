package com.mannat.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mannat.databinding.TrendingItemsBinding

class TrendingAdapter(private val context: Context) : RecyclerView.Adapter<TrendingAdapter.ViewHolder>() {
    private lateinit var binding: TrendingItemsBinding

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrendingAdapter.ViewHolder {
        binding = TrendingItemsBinding.inflate(LayoutInflater.from(context), parent, false)
        return ViewHolder(binding.root)
    }

    override fun onBindViewHolder(holder: TrendingAdapter.ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 10
    }
}