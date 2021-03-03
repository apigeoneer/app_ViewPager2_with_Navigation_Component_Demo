package com.gmail.apigeoneer.viewpager2withnavigationcomponentdemo.onboarding

import android.R.attr.data
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.gmail.apigeoneer.viewpager2withnavigationcomponentdemo.databinding.FragmentViewPagerBinding
import com.gmail.apigeoneer.viewpager2withnavigationcomponentdemo.onboarding.screens.FirstFragment
import com.gmail.apigeoneer.viewpager2withnavigationcomponentdemo.onboarding.screens.SecondFragment
import com.gmail.apigeoneer.viewpager2withnavigationcomponentdemo.onboarding.screens.ThirdFragment


//import kotlinx.android.synthetic.main.fragment_view_pager.view.*

/**
 * Contains the data that you want to display
 */
class ViewPagerFragment : Fragment() {

    // data binding
    private lateinit var binding: FragmentViewPagerBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_view_pager, container, false)

       // viewPager = view.findViewById(R.id.view_pager)

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

      //  view.viewPager.adapter = adapter // Synthetic view references have been deprecated and will not be supported in the future. *NEED TO USE DATA BINDING*

        return view
    }

}