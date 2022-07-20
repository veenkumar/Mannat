package com.mannat.view.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mannat.databinding.AdapterNotificationBinding

class NotificationAdapter(private val context: Context) : RecyclerView.Adapter<NotificationAdapter.ViewHolder>() {
    private lateinit var binding: AdapterNotificationBinding

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotificationAdapter.ViewHolder {
        binding = AdapterNotificationBinding.inflate(LayoutInflater.from(context), parent, false)
        return ViewHolder(binding.root)
    }

    override fun onBindViewHolder(holder: NotificationAdapter.ViewHolder, position: Int) {
        binding.textView7.text = "Test"
    }

    override fun getItemCount(): Int {
        return 18
    }
}