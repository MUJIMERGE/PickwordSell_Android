package com.smaryn.pws.and.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.smaryn.pws.and.R
import com.smaryn.pws.and.databinding.FragmentSellPostBinding

class SellPostFragment : Fragment() {
    lateinit var binding: FragmentSellPostBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_sell_post, container, false)
        return binding.root
    }
}