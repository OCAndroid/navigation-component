package org.ocandroid.nav.fragment

import androidx.fragment.app.Fragment

open class BindingFragment<B> : Fragment() {
    var binding: B? = null

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}