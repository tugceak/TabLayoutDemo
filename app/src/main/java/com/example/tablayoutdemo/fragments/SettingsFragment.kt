package com.example.tablayoutdemo.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tablayoutdemo.R
import com.example.tablayoutdemo.databinding.FragmentHomeBinding
import com.example.tablayoutdemo.databinding.FragmentProfileBinding
import com.example.tablayoutdemo.databinding.FragmentSettingsBinding


class SettingsFragment : Fragment() {
    private lateinit var mBining: FragmentSettingsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBining = FragmentSettingsBinding.inflate(inflater,container,false)
        return mBining.root

    }


}