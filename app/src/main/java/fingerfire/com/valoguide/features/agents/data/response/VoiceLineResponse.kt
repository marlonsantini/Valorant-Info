package fingerfire.com.valoguide.features.agents.data.response

import com.squareup.moshi.Json

data class VoiceLineResponse(
    @Json(name = "mediaList")
    val mediaList: List<MediaResponse>
)