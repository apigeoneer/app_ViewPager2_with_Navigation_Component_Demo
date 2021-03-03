package com.gmail.apigeoneer.viewpager2withnavigationcomponentdemo.onboarding.screens

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.gmail.apigeoneer.viewpager2withnavigationcomponentdemo.R
import kotlinx.android.synthetic.main.fragment_second.view.*
import kotlinx.android.synthetic.main.fragment_third.view.*

class ThirdScreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_third, container, false)

        view.finish_btn.setOnClickListener {
            findNavController().navigate(R.id.action_viewPagerFragment_to_homeFragment)                   // 0-indexing, 2 is actually the 3rd screen
            onBoardingFinished()
        }

        return view
    }

    // using a Shared preferences Object to save the value
    private fun onBoardingFinished() {
        // Using LiveTemplate for SharedPreferences
        val sharedPref = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.putBoolean("Finished", true)
        editor.apply()
    }
}