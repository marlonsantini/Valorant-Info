package fingerfire.com.valoguide.di

import fingerfire.com.valoguide.network.SetupRetrofit
import org.koin.dsl.module

class NetworkModules {

    fun getNetworkModules() = module {
        single {
            SetupRetrofit.getRetrofit()
        }
    }
}