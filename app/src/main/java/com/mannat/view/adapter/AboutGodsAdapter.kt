package com.mannat.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mannat.databinding.AboutGodsItemsBinding

class AboutGodsAdapter(private val context: Context) : RecyclerView.Adapter<AboutGodsAdapter.ViewHolder>() {
    private lateinit var binding: AboutGodsItemsBinding

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AboutGodsAdapter.ViewHolder {
        binding = AboutGodsItemsBinding.inflate(LayoutInflater.from(context), parent, false)
        return ViewHolder(binding.root)
    }

    override fun onBindViewHolder(holder: AboutGodsAdapter.ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 10
    }
}