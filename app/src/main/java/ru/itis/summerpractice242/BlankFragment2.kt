package ru.itis.summerpractice242

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import ru.itis.summerpractice242.databinding.FragmentBlank2Binding
import ru.itis.summerpractice242.databinding.FragmentMainBinding

class BlankFragment2 : Fragment(R.layout.fragment_blank2) {
    private var binding: FragmentBlank2Binding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentBlank2Binding.bind(view)

        binding?.run {
            tvTitle.setOnClickListener {
                findNavController().navigate(R.id.action_blankFragment2_to_blankFragment3)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}