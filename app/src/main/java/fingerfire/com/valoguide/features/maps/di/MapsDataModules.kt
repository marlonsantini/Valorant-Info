package fingerfire.com.valoguide.features.maps.di

import fingerfire.com.valoguide.features.maps.data.repository.MapsRepository
import org.koin.dsl.module

class MapsDataModules {
    fun getMapsDataModules() = module {
        factory {
            MapsRepository(get())
        }
    }
}