package org.ocandroid.nav.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import org.ocandroid.nav.databinding.FragmentWorkBinding

class WorkFragment : BindingFragment<FragmentWorkBinding>() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWorkBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding?.actionButton?.setOnClickListener {
            Toast.makeText(context, "No Destination!", Toast.LENGTH_SHORT).show()
        }
    }


}