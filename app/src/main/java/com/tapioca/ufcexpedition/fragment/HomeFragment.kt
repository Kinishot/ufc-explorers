package com.tapioca.ufcexpedition.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tapioca.ufcexpedition.R

/**
 * Fragmento da página da home
 */
class HomeFragment : Fragment() {

    // Companion object para representar a instância do singleton
    companion object {
        fun newInstance() = HomeFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.home_fragment, container, false)
    }

    fun View.OnClickListener() {

    }

}
