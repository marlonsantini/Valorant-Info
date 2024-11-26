package fingerfire.com.valoguide.di

import fingerfire.com.valoguide.api.ValorantApi
import org.koin.dsl.module
import retrofit2.Retrofit

class ApiModules {
    fun getApiModules() = module {
        factory<ValorantApi> {
            get<Retrofit>().create(ValorantApi::class.java)
        }
    }
}