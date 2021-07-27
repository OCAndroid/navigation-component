package org.ocandroid.nav.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import org.ocandroid.nav.databinding.FragmentStoreBinding

var instanceCount = 1

class StoreFragment : BindingFragment<FragmentStoreBinding>() {
    var instance: Int = instanceCount++

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStoreBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.run {
            storeLabel.text = "Welcome to the Store! ($instance)"

            val navController = findNavController()
            actionToAile1.setOnClickListener { navController.navigate(StoreFragmentDirections.actionToAile(1)) }
            actionToAile2.setOnClickListener { navController.navigate(StoreFragmentDirections.actionToAile(2)) }
            actionToAile3.setOnClickListener { navController.navigate(StoreFragmentDirections.actionToAile(3)) }
            exitButton.setOnClickListener { navController.popBackStack() }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        instanceCount--
    }
}