package fingerfire.com.valoguide.features.weapons.data.response

import com.squareup.moshi.Json

data class WeaponStatsResponse(
    @Json(name = "damageRanges")
    var damageRanges: MutableList<DamageRangesResponse>
)