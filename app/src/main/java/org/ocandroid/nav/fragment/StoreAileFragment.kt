package org.ocandroid.nav.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import org.ocandroid.nav.R
import org.ocandroid.nav.databinding.FragmentStoreAileBinding

class StoreAileFragment : BindingFragment<FragmentStoreAileBinding>() {

    private val args: StoreAileFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStoreAileBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.run {
            val backgroundColorId = when (args.number) {
                1 -> R.color.bg_store_aile_1
                2 -> R.color.bg_store_aile_2
                3 -> R.color.bg_store_aile_3
                else -> R.color.white
            }
            aileLabel.text = "Welcome to Aile #${args.number}"
            container.setBackgroundColor(ContextCompat.getColor(requireContext(), backgroundColorId))

            val navController = findNavController()
            actionToNextAile.setOnClickListener { navController.navigate(StoreAileFragmentDirections.actionToAile(args.number.inc())) }
            actionToBackroom.setOnClickListener { navController.navigate(StoreAileFragmentDirections.actionToBackroom()) }
            actionToStore.setOnClickListener { navController.navigate(StoreAileFragmentDirections.actionToStore()) }
            actionToLast.setOnClickListener { navController.popBackStack() }
            actionPopToHome.setOnClickListener { navController.popBackStack(R.id.homeFragment, false) }
        }
    }
}