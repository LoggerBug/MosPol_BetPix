package com.pixbet.pixbetapostas.pixbetapp.pixbetbr.screen.game

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.pixbet.pixbetapostas.pixbetapp.pixbetbr.R
import com.pixbet.pixbetapostas.pixbetapp.pixbetbr.SoundManager
import com.pixbet.pixbetapostas.pixbetapp.pixbetbr.databinding.FragmentTherdHistoryBinding


class TherdHistory : Fragment() {
    lateinit var binding: FragmentTherdHistoryBinding
    private lateinit var soundManager: SoundManager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTherdHistoryBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        soundManager = SoundManager.getInstance(requireContext())

        binding.text.text = "With good results and an increasing number of supporters, Corinthians joined the Liga Paulista, after winning two qualifying games, and played in the São Paulo State Championship for the first time, in 1913. Just one year after joining the league, Corinthians was crowned champion for the first time (in 1914), and were again two years later. There were many fly-by-night teams popping up in São Paulo at the time, and during the first practice held by Corinthians a banner was placed by the side of the field stating \"This One Will Last\". The year of 1922, the Centennial of Brazilian Independence, marks the start of Corinthians hegemony in the São Paulo State Championship. As football was almost exclusively played at Rio de Janeiro and São Paulo by that time, the two state champions were considered to be the two top clubs in Brazil. After defeating the Rio de Janeiro State Championship champion of that year, América, Corinthians joined the company of the great teams in Brazil. The same year also marked the first of three State Championships in a row, something that happened again in 1928–30 and 1937–39. Corinthians seemed destined to win State Championships in threes; after six years without being a champions, they came won three more from 1937 the 1939. The 1940s were a more difficult time; and the club would win a championship in 1941 and would only win their next in 1951.At the beginning of the 1950s Corinthians made history in the São Paulo Championship. In 1951, the team composed of Carbone, Cláudio, Luisinho, Baltasar and Mário scored 103 goals in thirty matches of the São Paulo Championship, registering an average of 3.43 per game. Carbone was the top goal-scorer of the competition with 30 goals. The club would also win the São Paulo Championships of 1952 and 1954."

        binding.next.setOnClickListener {
            findNavController().navigate(R.id.fourthHistory)
        }

        binding.back.setOnClickListener {
            findNavController().navigateUp()
        }
    }


}