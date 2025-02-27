package fingerfire.com.valoguide.features.agents.data.response

import com.squareup.moshi.Json

data class AbilitiesResponse(
    @Json(name = "description")
    val description: String,
    @Json(name = "displayIcon")
    val displayIcon: String,
    @Json(name = "displayName")
    val displayName: String,
    @Json(name = "slot")
    val slot: String
)