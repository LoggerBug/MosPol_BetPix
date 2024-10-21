package com.pixbet.pixbetapostas.pixbetapp.pixbetbr.screen.watchteam

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.pixbet.pixbetapostas.pixbetapp.pixbetbr.R
import com.pixbet.pixbetapostas.pixbetapp.pixbetbr.SoundManager
import com.pixbet.pixbetapostas.pixbetapp.pixbetbr.databinding.FragmentWatchTeamMainBinding


class WatchTeamMain : Fragment() {
    lateinit var binding : FragmentWatchTeamMainBinding
    private lateinit var soundManager: SoundManager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWatchTeamMainBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        soundManager = SoundManager.getInstance(requireContext())

        binding.atacantess.setOnClickListener {
            findNavController().navigate(R.id.atacker)
        }

        binding.goleiros.setOnClickListener {
            findNavController().navigate(R.id.gelerios)
        }

        binding.laterais.setOnClickListener {
            findNavController().navigate(R.id.laterais)
        }

        binding.back.setOnClickListener {
            findNavController().navigateUp()
        }

    }
}