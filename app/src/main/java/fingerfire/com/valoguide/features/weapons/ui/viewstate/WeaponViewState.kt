package fingerfire.com.valoguide.features.weapons.ui.viewstate

import fingerfire.com.valoguide.features.weapons.data.response.WeaponResponse

data class WeaponViewState(val sucess: WeaponResponse? = null, val failure: Boolean = false)