package fingerfire.com.valoguide.features.maps.ui.viewstate

import fingerfire.com.valoguide.features.maps.data.response.MapResponse

data class MapViewState(val sucess: MapResponse? = null, val failure: Boolean = false)