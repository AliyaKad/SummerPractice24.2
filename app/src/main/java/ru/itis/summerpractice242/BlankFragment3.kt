package ru.itis.summerpractice242

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import ru.itis.summerpractice242.databinding.FragmentBlank3Binding

class BlankFragment3 : Fragment(R.layout.fragment_blank3) {
    private var binding: FragmentBlank3Binding? = null

    private var adapter: PlanetAdapter? = null


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentBlank3Binding.bind(view)


        initAdapter()
    }


    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
    private fun initAdapter() {
        adapter = PlanetAdapter(
            list = PlanetRepository.planets,
            glide = Glide.with(this),
            onItemClicked = {
                val infoFragment = InfoFragment()
                fragmentManager?.beginTransaction()
                    ?.replace(R.id.container, infoFragment)
                    ?.addToBackStack(null)
                    ?.commit()
            }
        )
        binding?.rvPlanet?.adapter = adapter
        binding?.rvPlanet?.layoutManager = LinearLayoutManager(requireContext())
    }
}