package com.example.bottomtabapp.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import com.example.bottomtabapp.R
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.fragment_movie.*
import kotlinx.android.synthetic.main.fragment_tv.*


class MovieFragment : Fragment() {
    private lateinit var viewPagger: ViewPager
    private lateinit var tabs: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_movie, container, false)
        viewPagger = view.findViewById(R.id.viewpagger)
        tabs = view.findViewById(R.id.tab_np)

        val fragmentAdapter = Adapter(childFragmentManager)
        viewPagger.adapter = fragmentAdapter
        tabs.setupWithViewPager(viewPagger)

        return view
    }

    
}