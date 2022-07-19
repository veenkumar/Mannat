package com.mannat.view.activity.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import com.mannat.base.BaseActivity
import com.mannat.databinding.ActivitySplashScreenBinding
import com.mannat.view.activity.MainActivity

class SplashScreenActivity : BaseActivity<ActivitySplashScreenBinding>() {
    override val bindingInflater: (LayoutInflater) -> ActivitySplashScreenBinding
        get() = ActivitySplashScreenBinding::inflate

    override fun onViewBindingCreated(savedInstanceState: Bundle?) {
        super.onViewBindingCreated(savedInstanceState)

        Handler().postDelayed(
            {
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }, 3000L
        )
    }
}