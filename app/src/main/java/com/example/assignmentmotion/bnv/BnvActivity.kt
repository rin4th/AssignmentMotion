package com.example.assignmentmotion.bnv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentContainer
import androidx.fragment.app.FragmentContainerView
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.assignmentmotion.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class BnvActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bnv)

        val fragment = findViewById<FragmentContainerView>(R.id.fr_bnv)
        val Bnv = findViewById<BottomNavigationView>(R.id.bnv_main)

        Bnv.setupWithNavController(fragment.findNavController())
    }
}