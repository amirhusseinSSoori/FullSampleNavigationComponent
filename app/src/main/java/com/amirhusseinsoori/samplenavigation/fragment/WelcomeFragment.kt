package com.amirhusseinsoori.samplenavigation.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.amirhusseinsoori.samplenavigation.R

import kotlinx.android.synthetic.main.fragment_welcome.*

class WelcomeFragment :Fragment(R.layout.fragment_welcome) {
    private val args:WelcomeFragmentArgs by navArgs()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textUsername.text = args.username
        textPassword.text = args.password

        btnOk.setOnClickListener {
            findNavController().navigate(R.id.action_welcomeFragment_to_homeFragment)
        }
    }

}