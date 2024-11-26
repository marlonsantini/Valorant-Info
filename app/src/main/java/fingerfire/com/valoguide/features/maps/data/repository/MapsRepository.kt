package fingerfire.com.valoguide.features.maps.data.repository

import fingerfire.com.valoguide.api.ValorantApi
import fingerfire.com.valoguide.extensions.getAppLanguage
import fingerfire.com.valoguide.features.maps.data.response.MapDetailResponse
import fingerfire.com.valoguide.features.maps.data.response.MapResponse
import retrofit2.Response

class MapsRepository(private val valorantApi: ValorantApi) {

    suspend fun loadMaps(): Response<MapResponse> {
        return valorantApi.getMaps(getAppLanguage())
    }

    suspend fun getMapDetail(mapUuid: String): MapDetailResponse {
        return valorantApi.getMapsUuid(mapUuid, getAppLanguage())
    }
}