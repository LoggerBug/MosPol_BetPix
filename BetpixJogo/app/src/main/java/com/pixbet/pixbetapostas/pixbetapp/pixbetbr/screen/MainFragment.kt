package com.pixbet.pixbetapostas.pixbetapp.pixbetbr.screen

import android.app.NotificationChannel
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.NotificationCompat
import androidx.navigation.fragment.findNavController
import com.google.firebase.messaging.FirebaseMessaging
import com.google.firebase.messaging.FirebaseMessagingService
import com.pixbet.pixbetapostas.pixbetapp.pixbetbr.MyNotificationManager
import com.pixbet.pixbetapostas.pixbetapp.pixbetbr.R
import com.pixbet.pixbetapostas.pixbetapp.pixbetbr.SoundManager
import com.pixbet.pixbetapostas.pixbetapp.pixbetbr.databinding.FragmentMainBinding


class MainFragment : Fragment() {
    lateinit var binding : FragmentMainBinding
    private lateinit var soundManager: SoundManager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        soundManager = SoundManager.getInstance(requireContext())

        goNext()
    }


    fun goNext(){
        val controller = findNavController()
        binding.start.setOnClickListener {
            controller.navigate(R.id.startGame)
            val notificationManager = MyNotificationManager(requireContext())
            notificationManager.showNotification("ФЫВФЫВФЫВ", "Текст уведомления")
        }

        binding.legue.setOnClickListener {
            controller.navigate(R.id.legueTable)
        }

        binding.contact.setOnClickListener {
            controller.navigate(R.id.contactUs)
        }

        binding.policy.setOnClickListener {
            controller.navigate(R.id.privatePolicy)
        }
    }
}