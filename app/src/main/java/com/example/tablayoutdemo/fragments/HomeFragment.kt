package com.example.tablayoutdemo.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tablayoutdemo.R
import com.example.tablayoutdemo.databinding.FragmentHomeBinding
import com.example.tablayoutdemo.databinding.FragmentProfileBinding

class HomeFragment : Fragment() {
    private lateinit var mBining: FragmentHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        mBining = FragmentHomeBinding.inflate(inflater,container,false)
        return mBining.root
    }


}