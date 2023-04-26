package mobi.appcent.store.ui.screen.collections

/**
 * Created by erenalpaslan on 26.04.2023
 */
sealed interface CollectionsUiState {

    object Loading: CollectionsUiState

    data class CollectionsLoaded(
        val list: List<String> = emptyList(),
    ): CollectionsUiState
}