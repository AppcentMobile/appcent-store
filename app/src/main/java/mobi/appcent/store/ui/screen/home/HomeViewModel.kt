package mobi.appcent.store.ui.screen.home

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import mobi.appcent.medusa.store.MedusaApi
import mobi.appcent.store.common.base.BaseViewModel

/**
 * Created by erenalpaslan on 21.04.2023
 */
class HomeViewModel: BaseViewModel() {

    private val _uiState: MutableStateFlow<HomeUiState> = MutableStateFlow(HomeUiState())
    val uiState: StateFlow<HomeUiState> = _uiState.asStateFlow()

    fun onSearchTextChanged(text: String) {
        _uiState.update {
            it.copy(
                searchText = text
            )
        }
    }

    fun onSearchClearClicked() {
        _uiState.update {
            it.copy(
                searchText = ""
            )
        }
    }

}