package com.coelhoslab.android.appointmentapp.ui.fragments.initial

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.coelhoslab.android.appointmentapp.R
import com.coelhoslab.android.appointmentapp.adapter.initial.initialVPAdapter
import com.coelhoslab.android.appointmentapp.databinding.FragmentInitialBinding
import com.coelhoslab.android.appointmentapp.ui.fragments.initial.login.loginFragment
import com.coelhoslab.android.appointmentapp.ui.fragments.initial.register.registerFragment

class initialFragment : Fragment() {

    private var binding: FragmentInitialBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentInitialBinding.inflate(inflater, container, false)
        return binding?.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fragmentsList = listOf(loginFragment(), registerFragment())
        val fragmentsTitleList = listOf("Login", "Cadastro")

        activity?.let {
            val viewPagerAdapter = initialVPAdapter(
                fragmentManager = childFragmentManager,
                fragmentsList = fragmentsList,
                fragmentsTitleList = fragmentsTitleList
            )
            binding?.let { bindingNonNull ->
                with(bindingNonNull) {
                    initialVP.adapter = viewPagerAdapter
                    tabLayout.setupWithViewPager(initialVP)

                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}