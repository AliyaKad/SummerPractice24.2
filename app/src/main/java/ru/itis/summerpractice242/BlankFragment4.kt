package ru.itis.summerpractice242

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import ru.itis.summerpractice242.databinding.FragmentBlank4Binding
import ru.itis.summerpractice242.databinding.FragmentMainBinding

class BlankFragment4 : Fragment(R.layout.fragment_blank4) {
    private var binding: FragmentBlank4Binding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentBlank4Binding.bind(view)

        binding?.run {
            button.setOnClickListener {
                val emailText = etEmail.text.toString()
                if (emailText.isNotEmpty()) {
                    findNavController().navigate(
                        R.id.action_blankFragment4_to_newFragment,
                        NewFragment.bundle(emailText)
                    )
                } else {
                    Snackbar.make(
                        it, "Для отправки текста требуется заполнить поле",
                        Snackbar.LENGTH_LONG
                    ).show()
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}