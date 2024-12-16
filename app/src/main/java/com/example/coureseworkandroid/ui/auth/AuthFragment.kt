package com.example.coureseworkandroid.ui.auth

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.example.coureseworkandroid.MainActivity
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
        //_binding = FragmentAuthBinding.inflate(layoutInflater, container, false)
        //return mBinding.root

        val view = inflater.inflate(R.layout.fragment_auth, container, false)
        val buttonReg = view.findViewById<Button>(R.id.buttonToRegistration)
        buttonReg.setOnClickListener {
            findNavController().navigate(R.id.mainFragment)
        }
        return view

    }


}