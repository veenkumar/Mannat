package com.mannat.view.activity.signup

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.mannat.R
import com.mannat.base.BaseActivity
import com.mannat.databinding.ActivitySignupBinding
import com.mannat.view.activity.MainActivity
import com.mannat.view.activity.login.LoginActivity

class SignupActivity : BaseActivity<ActivitySignupBinding>() {
    override val bindingInflater: (LayoutInflater) -> ActivitySignupBinding
        get() = ActivitySignupBinding::inflate

    override fun onViewBindingCreated(savedInstanceState: Bundle?) {
        super.onViewBindingCreated(savedInstanceState)

        binding.signupButton.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        binding.etLogin.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }
    }
}