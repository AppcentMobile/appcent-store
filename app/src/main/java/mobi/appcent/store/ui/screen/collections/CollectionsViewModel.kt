package mobi.appcent.store.ui.screen.collections

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import mobi.appcent.store.common.base.BaseViewModel

/**
 * Created by erenalpaslan on 21.04.2023
 */
class CollectionsViewModel: BaseViewModel() {

    private val _uiState: MutableStateFlow<CollectionsUiState> = MutableStateFlow(CollectionsUiState.Loading)
    val uiState = _uiState.asStateFlow()

    init {
        _uiState.update {
            CollectionsUiState.CollectionsLoaded(
                listOf("https://picsum.photos/seed/picsum/200/300", "https://picsum.photos/seed/picsum/200/300", "https://picsum.photos/seed/picsum/200/300")
            )
        }
    }

}