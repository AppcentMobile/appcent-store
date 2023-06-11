package mobi.appcent.store.ui.screen.home

import mobi.appcent.medusa.store.model.response.ProductCollection

/**
 * Created by erenalpaslan on 4.06.2023
 */
data class CollectionsUiState(
    val isLoading: Boolean = false,
    val list: List<ProductCollection> = emptyList()
)
