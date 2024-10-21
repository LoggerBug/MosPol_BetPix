package com.pixbet.pixbetapostas.pixbetapp.pixbetbr.screen.game

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.pixbet.pixbetapostas.pixbetapp.pixbetbr.R
import com.pixbet.pixbetapostas.pixbetapp.pixbetbr.SoundManager
import com.pixbet.pixbetapostas.pixbetapp.pixbetbr.databinding.FragmentFourthHistoryBinding


class FourthHistory : Fragment() {
    lateinit var binding : FragmentFourthHistoryBinding
    private lateinit var soundManager: SoundManager

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFourthHistoryBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        soundManager = SoundManager.getInstance(requireContext())

        binding.text.text = "In this same decade, Corinthians were champions three times of the Rio-São Paulo Championship (1950, 1953 and 1954), the tournament that was becoming most important in the country with the increased participation of the greatest clubs from the two most important footballing states in the country. In 1953, in a championship in Venezuela, Corinthians won the Small Cup of the World, a championship that many consider as a precursor of the Worldwide Championship of Clubs. On the occasion, Corinthians, substituting for Vasco da Gama, went to Caracas, the Venezuelan capital and recorded six consecutive victories against Roma (1–0 and 3–1), Barcelona (3–2 and 1–0) and Selection of Caracas (2–1 and 2–0). The club would also win the Cup of the Centenary of São Paulo, in the same year (1954). After the triumphs in the São Paulo Championship and the Rio-São Paulo of 1954, Corinthians had a lengthy title drought. The breakthrough finally came when they won the São Paulo state championship in 1977, breaking a string of 23 years without a major title. Under the leadership of Sócrates, Wladimir and Casagrande, Corinthians were the first Brazilian club in which players decided about concentração, a common Brazilian practice where the football players were locked up in a hotel days before a game, and discussed politics. (In the early 1980s, military dictatorship, after two decades, ended in Brazil). In 1982, before the election of government of São Paulo State, the team wore a kit with the words: DIA 15 VOTE (Vote on 15th),trying to motivate the biggest number of fans to vote."


        binding.back.setOnClickListener {
            findNavController().navigateUp()
        }

    }

}