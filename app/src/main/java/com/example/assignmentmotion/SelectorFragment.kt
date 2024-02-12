package com.example.assignmentmotion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.assignmentmotion.databinding.FragmentSelectorBinding
import androidx.navigation.fragment.findNavController


/**
 * A simple [Fragment] subclass.
 * Use the [SelectorFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SelectorFragment : Fragment() {

    private var _binding: FragmentSelectorBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSelectorBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            btnSignin.setOnClickListener {
                navigateToLogin()
            }
            btnSignup.setOnClickListener {
                navigateToRegister()
            }
        }
    }

    private fun navigateToLogin(){
        val direction = SelectorFragmentDirections.actionSelectorFragmentToLoginFragment()
        findNavController().navigate(direction)
    }

    private fun navigateToRegister(){
        val direction = SelectorFragmentDirections.actionSelectorFragmentToRegisterFragment()
        findNavController().navigate(direction)
    }

}