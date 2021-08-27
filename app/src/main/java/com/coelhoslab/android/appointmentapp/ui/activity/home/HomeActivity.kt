package com.coelhoslab.android.appointmentapp.ui.activity.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.PopupMenu
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.coelhoslab.android.appointmentapp.R
import com.coelhoslab.android.appointmentapp.databinding.ActivityHomeBinding
import com.coelhoslab.android.appointmentapp.ui.activity.account.AccountActivity
import com.google.android.material.navigation.NavigationBarView

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)


       binding.navigationrail.setOnItemSelectedListener { MenuItem ->
           when(MenuItem.itemId){
               R.id.configNavigationRail -> {
                   startActivity(Intent(this, AccountActivity::class.java))
                   true
               }
               else -> false
           }
       }

    }



}