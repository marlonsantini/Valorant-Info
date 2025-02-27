package fingerfire.com.valoguide.features.agents.ui

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import coil.load
import fingerfire.com.valoguide.databinding.FragmentAgentDetailBinding
import fingerfire.com.valoguide.extensions.createGradientDrawable
import fingerfire.com.valoguide.features.agents.data.response.AgentDataResponse
import fingerfire.com.valoguide.features.agents.ui.adapter.AbilitiesAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel

class AgentDetailFragment : Fragment() {

    private lateinit var binding: FragmentAgentDetailBinding
    private val args: AgentDetailFragmentArgs by navArgs()
    private val viewModel: AgentDetailViewModel by viewModel()

    //private val mediaPlayer = MediaPlayer()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAgentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.getAgentDetail(args.uuid)
        initAgentDetailObserve()
        initBackButtonClickListener()

    }

    private fun initBackButtonClickListener() {
        binding.backButtonImageView.setOnClickListener {
//            if (mediaPlayer.isPlaying) {
//                mediaPlayer.stop()
//            }
            findNavController().popBackStack()
        }
    }

    private fun initUi(agentDataResponse: AgentDataResponse) {
        binding.apply {
            agentDataResponse.let { item ->
                binding.agentIconImageView.load(item.fullPortrait)
                binding.tvAgentName.text = item.displayName
                tvRole.text = item.role.displayName
                binding.tvDesc.text = item.description
                binding.rvAbilities.adapter = AbilitiesAdapter(item.abilities)

//                binding.ivVoice.setOnClickListener {
//                    if (!mediaPlayer.isPlaying)
//                        startVoice(item.voiceLine.mediaList[0].wave)
//                }

                val startColor = "#" + item.backgroundGradientColors[0].substring(0, 6)
                val centerColor = "#" + item.backgroundGradientColors[1].substring(0, 6)
                val endColor = "#" + item.backgroundGradientColors[2].substring(0, 6)
                val drawable = createGradientDrawable(startColor, centerColor, endColor)
                binding.agentIconImageView.background = drawable
            }
        }
    }

//    private fun startVoice(wav: String) {
//        mediaPlayer.reset()
//        try {
//            mediaPlayer.setDataSource(wav)
//        } catch (e: IllegalStateException) {
//            mediaPlayer.reset()
//            mediaPlayer.setDataSource(wav)
//        }
//        mediaPlayer.prepare()
//        mediaPlayer.start()
//        binding.ivVoice.setColorFilter(ContextCompat.getColor(requireContext(), R.color.main_red))
//        mediaPlayer.setOnCompletionListener {
//            binding.ivVoice.setColorFilter(ContextCompat.getColor(requireContext(), R.color.white))
//        }
//    }

    private fun initAgentDetailObserve() {
        viewModel.agentsDetailLiveData.observe(viewLifecycleOwner) {
            initUi(it.data)
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        val callback: OnBackPressedCallback =
            object : OnBackPressedCallback(true) {
                override fun handleOnBackPressed() {
//                    if (mediaPlayer.isPlaying) {
//                        mediaPlayer.stop()
//                    }
                    findNavController().popBackStack()
                }
            }
        requireActivity().onBackPressedDispatcher.addCallback(
            this,
            callback
        )
    }
}