package org.ocandroid.nav.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import org.ocandroid.nav.databinding.FragmentHomeBinding

class HomeFragment : BindingFragment<FragmentHomeBinding>() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.actionButton?.setOnClickListener {
            val destination = HomeFragmentDirections.actionToWork("Android Developer", true)
            findNavController().navigate(destination)
        }
    }
}