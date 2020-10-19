package com.example.bottomtabapp.view

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class TVAdapter(fm:FragmentManager):FragmentPagerAdapter(fm){

    override fun getItem(position: Int): Fragment {
        return when(position){
            0-> {
               TvNowPFragment()
            }
            else->{
                return TvTopRatedFragment()
            }
        }
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0->"TV Now Playing"
            else-> {
                return "Top Rated TV Shows"
            }
        }
    }
}
