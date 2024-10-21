package com.pixbet.pixbetapostas.pixbetapp.pixbetbr.screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.pixbet.pixbetapostas.pixbetapp.pixbetbr.R
import com.pixbet.pixbetapostas.pixbetapp.pixbetbr.SoundManager
import com.pixbet.pixbetapostas.pixbetapp.pixbetbr.databinding.FragmentPrivatePolicyBinding


class PrivatePolicy : Fragment() {
    lateinit var binding : FragmentPrivatePolicyBinding
    private lateinit var soundManager: SoundManager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPrivatePolicyBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val controller = findNavController()

        binding.back.setOnClickListener {
            controller.navigateUp()
        }

        binding.menu.setOnClickListener {
            controller.navigate(R.id.mainFragment)
            controller.popBackStack()
        }

    }

}