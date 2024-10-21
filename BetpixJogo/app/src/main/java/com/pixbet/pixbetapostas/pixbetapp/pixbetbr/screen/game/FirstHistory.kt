package com.pixbet.pixbetapostas.pixbetapp.pixbetbr.screen.game

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.pixbet.pixbetapostas.pixbetapp.pixbetbr.R
import com.pixbet.pixbetapostas.pixbetapp.pixbetbr.SoundManager
import com.pixbet.pixbetapostas.pixbetapp.pixbetbr.databinding.FragmentFirstHistoryBinding


class FirstHistory : Fragment() {
    lateinit var binding : FragmentFirstHistoryBinding
    private lateinit var soundManager: SoundManager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstHistoryBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        soundManager = SoundManager.getInstance(requireContext())

        binding.text.text = "Sport Club Corinthians Paulista, commonly referred to as Corinthians, is a Brazilian professional sports club based in São Paulo, in the district of Tatuapé.[Although it competes in multiple sports modalities, it is best known for its professional men's football team, which plays in the Campeonato Brasileiro Série A, the top tier of Brazilian football, as well as in the Campeonato Paulista Série A1, the first division of the traditional in-state competition. Founded in 1910 by five railway workers inspired by the London-based Corinthian Football Club, Corinthians traditionally plays in a white and black home kit. Their long-established crest was first introduced in 1939 by modernist painter Francisco Rebolo, featuring the São Paulo state flag in a shield, two oars, and an anchor, representing the club's early success in nautical sports. Corinthians has played their home matches at the Neo Química Arena since 2014, which served as one of the venues for the 2014 FIFA World Cup and also hosted the opening match. The club has longstanding rivalries with Palmeiras (known as Derby Paulista or simply The Derby), São Paulo (the Clássico Majestoso), and Santos (Clássico Alvinegro). One of the most widely supported teams in the world and the second most in Brazil, with over 30 million fans, Corinthians is one of the most successful Brazilian clubs, having won seven national titles, three Copa do Brasil trophies, one Supercopa do Brasil title, and a record 30 São Paulo State championships. In international competitions, the club won the inaugural FIFA Club World Championship in 2000, repeated the feat in 2012 after being crowned Copa Libertadores de América champions for the first time that same year, and also won a Recopa Sudamericana title. In 2017, the club was listed by Forbes as the most valuable football club in the Americas, valued at \$576.9 million."

        binding.next.setOnClickListener {
            findNavController().navigate(R.id.secondHistory)
        }

        binding.back.setOnClickListener {
            findNavController().navigateUp()
        }
    }
}