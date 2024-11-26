package fingerfire.com.valoguide.features.weapons.di

import fingerfire.com.valoguide.features.weapons.ui.WeaponDetailViewModel
import fingerfire.com.valoguide.features.weapons.ui.WeaponViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

class WeaponsUiModules {
    fun getWeaponsUiModules() = module {
        viewModelOf(::WeaponViewModel)
        viewModelOf(::WeaponDetailViewModel)
    }
}