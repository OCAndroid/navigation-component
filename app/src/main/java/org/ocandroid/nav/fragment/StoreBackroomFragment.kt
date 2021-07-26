package org.ocandroid.nav.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import org.ocandroid.nav.R
import org.ocandroid.nav.databinding.FragmentStoreBackroomBinding

class StoreBackroomFragment : BindingFragment<FragmentStoreBackroomBinding>() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStoreBackroomBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.run {
            val navController = findNavController()
            actionToLast.setOnClickListener { navController.popBackStack()  }
            actionPopToWork.setOnClickListener { navController.popBackStack(R.id.workFragment, false) }
            actionPopToHome.setOnClickListener { navController.popBackStack(R.id.homeFragment, false) }
        }
    }
}