package fingerfire.com.valoguide.features.agents.di

import fingerfire.com.valoguide.features.agents.data.repository.AgentsRepository
import org.koin.dsl.module

class AgentsDataModules {
    fun getAgentsDataModules() = module {
        factory {
            AgentsRepository(get())
        }
    }
}