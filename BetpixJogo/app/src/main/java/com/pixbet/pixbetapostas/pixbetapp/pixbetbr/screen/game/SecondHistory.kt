package com.pixbet.pixbetapostas.pixbetapp.pixbetbr.screen.game

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.pixbet.pixbetapostas.pixbetapp.pixbetbr.R
import com.pixbet.pixbetapostas.pixbetapp.pixbetbr.SoundManager
import com.pixbet.pixbetapostas.pixbetapp.pixbetbr.databinding.FragmentSecondHistoryBinding


class SecondHistory : Fragment() {
    lateinit var binding : FragmentSecondHistoryBinding
    private lateinit var soundManager: SoundManager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondHistoryBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.text.text = "In 1910, the top clubs were formed by people who were part of the upper classes.Among them were Club Athletico Paulistano, São Paulo Athletic Club, & Associação Atlética das Palmeiras. Lower-class society, excluded from larger clubs, founded their own minnow clubs and only played \"floodplain\" football. Bucking the trend, a group of five workers of the São Paulo Railway, them being, Joaquim Ambrose and Anthony Pereira (wall painters), Rafael Perrone (shoemaker), Anselmo Correia (driver) and Carlos Silva (general laborer), residents of the neighborhood of Bom Retiro. It was 31 August 1910 when these workers were watching a match featuring a London-based club touring Brazil, Corinthian F.C.After the match, while the group returned home, the men talked about partnerships, business ideas, and general dreams of grandeur. They each surfaced one idea: the foundation of a club, after several exchanges in a lively argument, a common ground led those athletes the same dream. The arguments led to the conclusion that they would meet the next day to make their dream into reality. On 1 September 1910, the group agreed to meet after sundown in public sight. That night at 8:30pm, on Rua José Paulino (\"Rua dos Imigrantes\" (Immigrants Street), the five workers reunited alongside their guest and neighbors from Bom Retiro. That night the club was founded, alongside its board of directors, who elected Miguel Battaglia as the first Club President. Corinthians played their first match on 10 September 1910, away against União da Lapa, a respected amateur club in São Paulo, and they were defeated by 1–0. On 14 September, Luis Fabi scored Corinthians' first goal against Estrela Polar, another amateur club in the city, and Corinthians won their first game (2–0)."

        soundManager = SoundManager.getInstance(requireContext())

        binding.next.setOnClickListener {
            findNavController().navigate(R.id.therdHistory)
        }

        binding.back.setOnClickListener {
            findNavController().navigateUp()
        }
    }


}