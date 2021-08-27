package com.coelhoslab.android.appointmentapp.ui.fragments.initial.login

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.coelhoslab.android.appointmentapp.R
import com.coelhoslab.android.appointmentapp.databinding.FragmentLoginBinding
import com.coelhoslab.android.appointmentapp.ui.activity.home.HomeActivity

class loginFragment : Fragment() {

    private var binding: FragmentLoginBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.floatingActionButton?.setOnClickListener{
            startActivity(Intent(activity, HomeActivity::class.java))
        }

    }


}