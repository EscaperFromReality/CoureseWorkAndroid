package com.example.coureseworkandroid.ui.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.example.coureseworkandroid.R
import com.example.coureseworkandroid.databinding.FragmentAuthBinding
import com.example.coureseworkandroid.databinding.FragmentMainBinding


class AuthFragment : Fragment() {

    private var _binding: FragmentAuthBinding? = null
    private val mBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAuthBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }

}