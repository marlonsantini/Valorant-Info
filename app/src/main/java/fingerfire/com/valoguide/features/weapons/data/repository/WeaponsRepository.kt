package fingerfire.com.valoguide.features.weapons.data.repository

import fingerfire.com.valoguide.api.ValorantApi
import fingerfire.com.valoguide.extensions.getAppLanguage
import fingerfire.com.valoguide.features.weapons.data.response.WeaponDetailResponse
import fingerfire.com.valoguide.features.weapons.data.response.WeaponResponse
import retrofit2.Response

class WeaponsRepository(private val valorantApi: ValorantApi) {

    suspend fun loadWeapons(): Response<WeaponResponse> {
        return valorantApi.getWeapons(getAppLanguage())
    }

    suspend fun getWeaponDetail(weaponUuid: String): WeaponDetailResponse {
        return valorantApi.getWeaponsUuid(weaponUuid, getAppLanguage())
    }
}