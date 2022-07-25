package com.example.android.natureindex.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android.natureindex.R
import com.example.android.natureindex.databinding.FragmentImageDetailsBinding

class ImageDetailsFragment : Fragment() {

    private var _binding: FragmentImageDetailsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentImageDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }
}