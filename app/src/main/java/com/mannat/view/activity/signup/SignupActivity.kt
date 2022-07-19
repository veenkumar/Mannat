package com.mannat.view.activity.signup

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.mannat.R
import com.mannat.base.BaseActivity
import com.mannat.databinding.ActivitySignupBinding

class SignupActivity : BaseActivity<ActivitySignupBinding>() {
    override val bindingInflater: (LayoutInflater) -> ActivitySignupBinding
        get() = ActivitySignupBinding::inflate

    override fun onViewBindingCreated(savedInstanceState: Bundle?) {
        super.onViewBindingCreated(savedInstanceState)


    }
}