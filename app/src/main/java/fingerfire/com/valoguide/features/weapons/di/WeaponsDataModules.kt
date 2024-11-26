package fingerfire.com.valoguide.features.weapons.di

import fingerfire.com.valoguide.features.weapons.data.repository.WeaponsRepository
import org.koin.dsl.module

class WeaponsDataModules {
    fun getWeaponsDataModules() = module {
        factory {
            WeaponsRepository(get())
        }
    }
}