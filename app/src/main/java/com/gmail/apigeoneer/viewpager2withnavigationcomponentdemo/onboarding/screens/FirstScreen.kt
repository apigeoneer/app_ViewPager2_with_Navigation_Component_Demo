package com.gmail.apigeoneer.viewpager2withnavigationcomponentdemo.onboarding.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.gmail.apigeoneer.viewpager2withnavigationcomponentdemo.R
import kotlinx.android.synthetic.main.fragment_first.view.*

class FirstScreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first, container, false)

        val viewPager = activity?.findViewById<ViewPager2>(R.id.view_pager)

        view.next1_btn.setOnClickListener {
            viewPager?.currentItem = 1                     // 0-indexing, 1 is actually the 2nd screen
        }

        return view
    }
}