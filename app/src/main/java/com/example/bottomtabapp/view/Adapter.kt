package com.example.bottomtabapp.view

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class Adapter(fm:FragmentManager): FragmentPagerAdapter(fm){
    override fun getItem(position: Int): Fragment {
        return when(position){
            0-> {
                MovieNowPlayingFragment()
            }
            else->{
                return MoviesTopRatedFragment()
            }
        }
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0->"Now Playing Movies"
            else-> {
                return "Top Rated Movies "
            }
        }
    }
}