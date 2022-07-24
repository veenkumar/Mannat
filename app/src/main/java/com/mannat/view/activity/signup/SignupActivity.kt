package com.mannat.view.activity.signup

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.mannat.R
import com.mannat.base.BaseActivity
import com.mannat.databinding.ActivitySignupBinding
import com.mannat.view.activity.login.LoginActivity
import com.mannat.view.fragment.signup.OtpFragment

class SignupActivity : BaseActivity<ActivitySignupBinding>() {
    override val bindingInflater: (LayoutInflater) -> ActivitySignupBinding
        get() = ActivitySignupBinding::inflate

    override fun onViewBindingCreated(savedInstanceState: Bundle?) {
        super.onViewBindingCreated(savedInstanceState)

        this.supportFragmentManager.beginTransaction()
            .replace(R.id.myNavHostFragment, OtpFragment())
            .commit()
    }
}