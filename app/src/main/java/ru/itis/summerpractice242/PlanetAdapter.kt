package ru.itis.summerpractice242

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import ru.itis.summerpractice242.databinding.ItemPlanetBinding

class PlanetAdapter(
    private val list: List<Planet>,
    private val glide: RequestManager,
    private val onItemClicked: (Planet) -> Unit
) : RecyclerView.Adapter<PlanetAdapter.PlanetViewHolder>() {

    inner class PlanetViewHolder(val binding: ItemPlanetBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(planet: Planet) {
            binding.run {
                tvPlanet.text = planet.name
                tvInfo.text = planet.info

                Glide.with(itemView.context).load(planet.url).into(ivImage)
            }
            itemView.setOnClickListener {
                onItemClicked(planet)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlanetViewHolder {
        val binding = ItemPlanetBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PlanetViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PlanetViewHolder, position: Int) {
        val planet = list[position]
        holder.bind(planet)
    }

    override fun getItemCount(): Int = list.size
}
