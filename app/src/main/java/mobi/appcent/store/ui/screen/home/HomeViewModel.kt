package mobi.appcent.store.ui.screen.home

import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import mobi.appcent.store.common.base.BaseViewModel
import mobi.appcent.store.core.navigation.AppNavigator
import mobi.appcent.store.core.navigation.screen.Routes
import mobi.appcent.store.data.model.Product
import mobi.appcent.store.domain.usecases.GetCollectionsUseCase
import mobi.appcent.store.utils.AppResult
import mobi.appcent.store.utils.extension.postEvent

/**
 * Created by erenalpaslan on 21.04.2023
 */
class HomeViewModel(
    private val navigator: AppNavigator,
    private val getCollectionsUseCase: GetCollectionsUseCase,
): BaseViewModel() {

    private val _uiState: MutableStateFlow<HomeUiState> = MutableStateFlow(HomeUiState())
    val uiState: StateFlow<HomeUiState> = _uiState.asStateFlow()

    private val _collectionUiState: MutableStateFlow<CollectionsUiState> = MutableStateFlow(
        CollectionsUiState()
    )
    val collectionUiState = _collectionUiState.asStateFlow()

    init {
        getCollections()
    }

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

    fun onProductDetailClicked(product: Product) {
        navigator.navigate(Routes.productDetailRoute)
    }

    private fun getCollections() {
        viewModelScope.launch {
            _collectionUiState.update { it.copy(isLoading = true) }
            getCollectionsUseCase.execute(Unit).collect { result ->
                when(result) {
                    is AppResult.Error -> {
                        _error.postValue(result.message)
                        _collectionUiState.update { it.copy(isLoading = false) }
                    }
                    is AppResult.Success -> {
                        _collectionUiState.update { it.copy(
                            isLoading = false,
                            list = result.data ?: emptyList()
                        ) }
                    }
                }
            }
        }
    }
}