package fingerfire.com.valoguide.features.maps.data.response

import com.squareup.moshi.Json

data class MapDetailResponse(
    @Json(name = "data")
    val data: MapDataResponse,
    @Json(name = "status")
    val status: String

)