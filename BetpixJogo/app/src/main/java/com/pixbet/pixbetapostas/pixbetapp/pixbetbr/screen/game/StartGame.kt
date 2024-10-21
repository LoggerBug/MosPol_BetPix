package com.pixbet.pixbetapostas.pixbetapp.pixbetbr.screen.game

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.pixbet.pixbetapostas.pixbetapp.pixbetbr.MyNotificationManager
import com.pixbet.pixbetapostas.pixbetapp.pixbetbr.R
import com.pixbet.pixbetapostas.pixbetapp.pixbetbr.SoundManager
import com.pixbet.pixbetapostas.pixbetapp.pixbetbr.databinding.FragmentStartGameBinding


class StartGame : Fragment() {
    lateinit var binding : FragmentStartGameBinding
    private lateinit var soundManager: SoundManager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStartGameBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        soundManager = SoundManager.getInstance(requireContext())

        val notificationManager = MyNotificationManager(requireContext())
        notificationManager.showNotification("Игра началась", "Поздравяем")

        val controller = findNavController()
        binding.back.setOnClickListener {
            controller.navigateUp()
        }

        binding.watchTeam.setOnClickListener {
            controller.navigate(R.id.watchTeamMain)
        }

        binding.history.setOnClickListener {
            controller.navigate(R.id.firstHistory)
        }

    }
}