package fingerfire.com.valoguide.features.agents.data.response

import com.squareup.moshi.Json

data class MediaResponse(
    @Json(name = "wave")
    val wave: String
)