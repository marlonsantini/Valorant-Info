package fingerfire.com.valoguide.features.agents.ui.viewstate

import fingerfire.com.valoguide.features.agents.data.response.AgentResponse

data class AgentViewState(val sucess: AgentResponse? = null, val failure: Boolean = false)