package com.gmail.apigeoneer.viewpager2withnavigationcomponentdemo.onboarding

import android.R.attr.data
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.gmail.apigeoneer.viewpager2withnavigationcomponentdemo.R
import com.gmail.apigeoneer.viewpager2withnavigationcomponentdemo.onboarding.screens.FirstFragment
import com.gmail.apigeoneer.viewpager2withnavigationcomponentdemo.onboarding.screens.SecondFragment
import com.gmail.apigeoneer.viewpager2withnavigationcomponentdemo.onboarding.screens.ThirdFragment
import kotlinx.android.synthetic.main.fragment_view_pager.view.*

/**
 * Contains the data that you want to display
 */
class ViewPagerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_view_pager, container, false)

        val fragmentList = arrayListOf<Fragment>(
                FirstFragment(),
                SecondFragment(),
                ThirdFragment()
        )

        val adapter = ViewPagerAdapter(
                fragmentList,
                requireActivity().supportFragmentManager,
                lifecycle
        )

        // Make sure you have the 'kotlin-android-extensions' plugin added to the app.gradle file
        view.view_pager.adapter = adapter // Depreciated Synthetic view references won't be a problem. Data binding not mandatory.

        return view
    }

}