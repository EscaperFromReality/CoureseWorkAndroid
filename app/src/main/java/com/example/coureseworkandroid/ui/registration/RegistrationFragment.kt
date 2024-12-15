package com.example.coureseworkandroid.ui.registration

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.coureseworkandroid.R
import com.example.coureseworkandroid.databinding.FragmentMainBinding
import com.example.coureseworkandroid.databinding.FragmentRegistrationBinding


class RegistrationFragment : Fragment() {

    private var _binding: FragmentRegistrationBinding? = null
    private val mBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRegistrationBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }

}