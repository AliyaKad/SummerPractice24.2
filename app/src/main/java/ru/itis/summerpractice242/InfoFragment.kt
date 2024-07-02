package ru.itis.summerpractice242

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import ru.itis.summerpractice242.databinding.FragmentInfoBinding

class InfoFragment() : Fragment(R.layout.fragment_info) {
    private var binding: FragmentInfoBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentInfoBinding.bind(view)

        binding?.run {
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}