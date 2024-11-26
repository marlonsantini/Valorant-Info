package fingerfire.com.valoguide.features.agents.di

import fingerfire.com.valoguide.features.agents.ui.AgentDetailViewModel
import fingerfire.com.valoguide.features.agents.ui.AgentViewModel
import org.koin.core.module.dsl.viewModelOf
import org.koin.dsl.module

class AgentsUiModules {
    fun getViewModules() = module {
        viewModelOf(::AgentViewModel)
        viewModelOf(::AgentDetailViewModel)
    }
}