package com.amirhusseinsoori.samplenavigation.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.amirhusseinsoori.samplenavigation.R

import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment :Fragment(R.layout.fragment_login) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        confirm_button.setOnClickListener {
            val username=edit_text_username.text.toString()
            val password=edit_text_username.text.toString()
            val action=LoginFragmentDirections.actionLoginFragmentToWelcomeFragment(username,password)
            findNavController().navigate(action)
        }



    }
}