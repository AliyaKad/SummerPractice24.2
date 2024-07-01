package ru.itis.summerpractice242

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import ru.itis.summerpractice242.databinding.FragmentBlank3Binding
import ru.itis.summerpractice242.databinding.FragmentBlank4Binding
import ru.itis.summerpractice242.databinding.FragmentMainBinding

class BlankFragment3 : Fragment(R.layout.fragment_blank3) {
    private var binding: FragmentBlank3Binding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentBlank3Binding.bind(view)

        binding?.run {
            tvTitle.setOnClickListener {
                findNavController().navigate(R.id.action_blankFragment3_to_blankFragment4)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}