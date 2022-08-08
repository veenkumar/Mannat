package com.mannat.view.activity.notification

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.mannat.base.BaseActivity
import com.mannat.databinding.ActivityNotificationBinding
import com.mannat.view.adapter.NotificationAdapter

class NotificationActivity : BaseActivity<ActivityNotificationBinding>() {
    private lateinit var notificationAdapter: NotificationAdapter

    override val bindingInflater: (LayoutInflater) -> ActivityNotificationBinding
        get() = ActivityNotificationBinding::inflate

    override fun onViewBindingCreated(savedInstanceState: Bundle?) {
        super.onViewBindingCreated(savedInstanceState)

        binding.include2.tHeading.text = "Notifications"
        binding.include2.tNotification.visibility = View.GONE

        binding.notificationRecyclerView.layoutManager =
            LinearLayoutManager(applicationContext, LinearLayoutManager.VERTICAL, false)
        notificationAdapter = NotificationAdapter(applicationContext)
        binding.notificationRecyclerView.adapter = notificationAdapter
        notificationAdapter.notifyDataSetChanged()
    }
}