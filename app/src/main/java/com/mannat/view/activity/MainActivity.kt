package com.mannat.view.activity

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.mannat.R
import com.mannat.base.BaseActivity
import com.mannat.databinding.ActivityMainBinding
import com.mannat.view.activity.notification.NotificationActivity
import com.mannat.view.fragment.bottomnav.*
import com.mannat.viewmodel.MainViewModel

class MainActivity : BaseActivity<ActivityMainBinding>() {
    val viewModel by viewModels<MainViewModel>()

    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding
        get() = ActivityMainBinding::inflate

    override fun onViewBindingCreated(savedInstanceState: Bundle?) {
        super.onViewBindingCreated(savedInstanceState)

        /*binding.include.tNotification.setOnClickListener {
            startActivity(Intent(this, NotificationActivity::class.java))
        }*/

        this.supportFragmentManager.beginTransaction()
//            .add(MainFragment(),"MainFragment")
//            .addToBackStack("MainFragment")
            .replace(R.id.navView, MainFragment())
            .commit()

        binding.bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    this.supportFragmentManager.beginTransaction()
//                        .add(MainFragment(), "MainFragment")
                        .replace(R.id.navView, MainFragment())
                        .commit()
                    true
                }
                R.id.member -> {
                    this.supportFragmentManager.beginTransaction()
                        .replace(R.id.navView, MemberFragment())
                        .commit()
                    true
                }
                R.id.create_post -> {
                    this.supportFragmentManager.beginTransaction()
                        .replace(R.id.navView, CreatePostFragment())
                        .commit()
                    true
                }
                R.id.profile -> {
                    this.supportFragmentManager.beginTransaction()
                        .replace(R.id.navView, ProfileFragment())
                        .commit()
                    true
                }
                R.id.setting -> {
                    this.supportFragmentManager.beginTransaction()
                        .replace(R.id.navView, SettingsFragment())
                        .commit()
                    true
                }
                else -> {
                    false
                }
            }
        }
    }

     override fun onBackPressed() {
         val alertDialogBuilder = AlertDialog.Builder(this)
         alertDialogBuilder.setTitle(R.string.app_name)
         alertDialogBuilder
             .setMessage("Are you sure you want to exit")
             .setCancelable(false)
             .setPositiveButton("Yes") { dialog, id -> // if this button is clicked, close
                 val a = Intent(Intent.ACTION_MAIN)
                 a.addCategory(Intent.CATEGORY_HOME)
                 a.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                 startActivity(a)
             }
             .setNegativeButton("No") { dialog, id -> // if this button is clicked, just closex
                 dialog.cancel()
             }
         val alertDialog = alertDialogBuilder.create()
         alertDialog.show()
     }
}