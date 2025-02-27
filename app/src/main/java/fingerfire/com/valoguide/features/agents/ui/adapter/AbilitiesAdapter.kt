package fingerfire.com.valoguide.features.agents.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import fingerfire.com.valoguide.databinding.ItemAbilitiesBinding
import fingerfire.com.valoguide.extensions.createGradientDrawable
import fingerfire.com.valoguide.features.agents.data.response.AbilitiesResponse

class AbilitiesAdapter(
    private val abilitiesList: List<AbilitiesResponse>
) : RecyclerView.Adapter<AbilitiesAdapter.AbilitiesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AbilitiesViewHolder {
        return AbilitiesViewHolder(
            ItemAbilitiesBinding
                .inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: AbilitiesViewHolder, position: Int) {
        with(holder) {
            with(abilitiesList[position]) {
                binding.abilityTitleTextView.text = displayName
                binding.abilityImageView.load(displayIcon)
                binding.abilityDescriptionTextView.text = description

                val drawable = createGradientDrawable("#ba89ffff", "#6241ccff", "#38328eff")
                binding.abilityImageView.background = drawable
            }
        }
    }

    override fun getItemCount(): Int {
        return abilitiesList.size
    }

    class AbilitiesViewHolder(val binding: ItemAbilitiesBinding) :
        RecyclerView.ViewHolder(binding.root)
}