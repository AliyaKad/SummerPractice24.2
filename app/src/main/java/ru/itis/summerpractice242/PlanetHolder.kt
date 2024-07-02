package ru.itis.summerpractice242

import android.content.Context
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import ru.itis.summerpractice242.databinding.ItemPlanetBinding

class PlanetHolder(private val binding: ItemPlanetBinding, private val glide: RequestManager): ViewHolder(binding.root) {

    private val requestOptions = RequestOptions
        .diskCacheStrategyOf(
            DiskCacheStrategy.ALL
        )

    private val context: Context
        get() = itemView.context

    fun onBind(planet: Planet) {
        binding.run {
            tvPlanet.text = planet.name
            tvInfo.text = planet.info

            Glide.with(itemView.context).load(planet.url).into(ivImage)
        }
    }
}