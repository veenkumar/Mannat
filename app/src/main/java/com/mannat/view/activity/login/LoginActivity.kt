package com.mannat.view.activity.login

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.mannat.R
import com.mannat.base.BaseActivity
import com.mannat.databinding.ActivityLoginBinding
import com.mannat.view.activity.MainActivity
import com.mannat.view.activity.signup.SignupActivity

class LoginActivity : BaseActivity<ActivityLoginBinding>() {
    override val bindingInflater: (LayoutInflater) -> ActivityLoginBinding
        get() = ActivityLoginBinding::inflate

    override fun onViewBindingCreated(savedInstanceState: Bundle?) {
        super.onViewBindingCreated(savedInstanceState)

        binding.loginButton.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }


        binding.etSignup.setOnClickListener {
            startActivity(Intent(this, SignupActivity::class.java))
            finish()
        }
    }
}