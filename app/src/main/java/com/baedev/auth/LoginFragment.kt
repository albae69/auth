package com.baedev.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_login.*
import kotlinx.android.synthetic.main.fragment_login.view.*


class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_login, container, false)

        view.btnLogin.setOnClickListener {
            val username = etUsername.text.toString()
            val password = etPassword.text.toString()
            val user = "admin"

            if (username.isEmpty() && password.isEmpty()) {
                tvErrorMessage.text = getString(R.string.form_login_empty)
            } else {
                if (username != user || password != user) {
                    tvErrorMessage.text = getString(R.string.form_login_error)
                } else {
                    Navigation.findNavController(view).navigate(R.id.navigateToHome)
                }
            }

        }

        return view


    }

}