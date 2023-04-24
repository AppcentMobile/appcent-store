package mobi.appcent.store.ui.screen.home

/**
 * Created by erenalpaslan on 21.04.2023
 */
data class HomeUiState(
    val homeData: List<String> = emptyList(),
    val searchText: String = ""
)