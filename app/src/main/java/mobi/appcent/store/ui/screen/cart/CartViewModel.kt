package mobi.appcent.store.ui.screen.cart

import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import mobi.appcent.store.common.base.BaseViewModel
import mobi.appcent.store.data.model.Product

/**
 * Created by erenalpaslan on 21.04.2023
 */
class CartViewModel: BaseViewModel() {
    private val _uiState: MutableStateFlow<CartUiState> = MutableStateFlow(CartUiState.Loading)
    val uiState = _uiState.asStateFlow()

    init {
        viewModelScope.launch {
            _uiState.update {
                CartUiState.UserCart(
                    350.0,
                    2,
                    listOf(
                        Product("https://picsum.photos/id/237/200/300", 300, "test product 1"),
                        Product("https://picsum.photos/id/237/200/300", 200, "test product 2"),
                        Product("https://picsum.photos/id/237/200/300", 200, "test product 3")
                    )
                )
            }
            /*_uiState.update {
                CartUiState.Empty
            }*/
        }
    }
}