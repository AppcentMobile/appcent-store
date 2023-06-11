package mobi.appcent.store.ui.screen.home

import mobi.appcent.medusa.store.model.response.ProductCollection

/**
 * Created by erenalpaslan on 21.04.2023
 */
data class HomeUiState(
    val homeData: List<String> = emptyList(),
    val collections: List<ProductCollection> = emptyList(),
    val searchText: String = ""
)