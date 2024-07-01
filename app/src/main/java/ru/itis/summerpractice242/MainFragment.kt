package ru.itis.summerpractice242

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import ru.itis.summerpractice242.databinding.FragmentMainBinding

class MainFragment : Fragment(R.layout.fragment_main) {

    private var binding: FragmentMainBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainBinding.bind(view)

        binding?.run {
            tvTitle.setOnClickListener {
                findNavController().navigate(R.id.action_mainFragment_to_blankFragment1)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}