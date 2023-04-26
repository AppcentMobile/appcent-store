package mobi.appcent.store.ui.screen.profile

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import mobi.appcent.store.common.base.BaseViewModel

/**
 * Created by erenalpaslan on 21.04.2023
 */
class ProfileViewModel: BaseViewModel() {

    private val _uiState: MutableStateFlow<ProfileUiState> = MutableStateFlow(ProfileUiState())
    val uiState = _uiState.asStateFlow()

    init {
        _uiState.update {
            ProfileUiState("Eren Alpaslan")
        }
    }

}