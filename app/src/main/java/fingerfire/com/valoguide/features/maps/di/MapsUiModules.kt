package fingerfire.com.valoguide.features.maps.di

import fingerfire.com.valoguide.features.maps.ui.MapDetailViewModel
import fingerfire.com.valoguide.features.maps.ui.MapsViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

class MapsUiModules {

    fun getViewModules() = module {
        viewModelOf(::MapDetailViewModel)
        viewModelOf(::MapsViewModel)
    }
}