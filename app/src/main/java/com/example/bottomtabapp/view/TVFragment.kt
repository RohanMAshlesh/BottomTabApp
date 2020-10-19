package com.example.bottomtabapp.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import com.example.bottomtabapp.R
import com.google.android.material.tabs.TabLayout

class TVFragment : Fragment() {
    private lateinit var viewPagger2: ViewPager
    private lateinit var tabs2: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view2: View = inflater.inflate(R.layout.fragment_tv, container, false)
        viewPagger2 = view2.findViewById(R.id.viewpagger2)
        tabs2 = view2.findViewById(R.id.tab_tv)

        val fragmentAdapter = TVAdapter(childFragmentManager)
        viewPagger2.adapter = fragmentAdapter
        tabs2.setupWithViewPager(viewPagger2)

        return view2
    }

}