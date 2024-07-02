package ru.itis.summerpractice242

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import ru.itis.summerpractice242.databinding.FragmentMainBinding
import ru.itis.summerpractice242.databinding.FragmentNewBinding

class NewFragment : Fragment(R.layout.fragment_new) {
    private var binding: FragmentNewBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentNewBinding.bind(view)

        val email = arguments?.getString(ARG_EMAIL) ?: "ERROR"
        binding?.tvTitle?.text = "text: $email"

    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    companion object {
        private const val ARG_EMAIL = "ARG_EMAIL"

        fun bundle(email: String): Bundle = Bundle().apply {
            putString(ARG_EMAIL, email)
        }
    }
}