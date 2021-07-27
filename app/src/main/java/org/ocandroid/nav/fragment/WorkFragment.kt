package org.ocandroid.nav.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import org.ocandroid.nav.databinding.FragmentWorkBinding

class WorkFragment : BindingFragment<FragmentWorkBinding>() {

    private val args: WorkFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWorkBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.run {
            actionButton.setOnClickListener {
                findNavController().navigate(WorkFragmentDirections.actionToStore())
            }

            actionButton2.setOnClickListener {
                findNavController().navigate(WorkFragmentDirections.actionToStoreWithPopInclusive())
            }
        }
    }
}