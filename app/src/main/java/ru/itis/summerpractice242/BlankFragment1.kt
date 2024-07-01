package ru.itis.summerpractice242

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import ru.itis.summerpractice242.databinding.FragmentBlank1Binding
import ru.itis.summerpractice242.databinding.FragmentMainBinding

class BlankFragment1 : Fragment(R.layout.fragment_blank1) {

    private var binding: FragmentBlank1Binding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentBlank1Binding.bind(view)

        binding?.run {
            tvTitle.setOnClickListener {
                findNavController().navigate(R.id.action_blankFragment1_to_blankFragment2)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}