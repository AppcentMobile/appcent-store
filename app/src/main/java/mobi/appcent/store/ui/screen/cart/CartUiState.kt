package mobi.appcent.store.ui.screen.cart

import mobi.appcent.store.data.model.Product

/**
 * Created by erenalpaslan on 25.04.2023
 */
sealed interface CartUiState {

    object Loading: CartUiState

    data class UserCart(
        val totalAmount: Double,
        val totalItemCount: Int,
        val list: List<Product>
    ): CartUiState

    object Empty: CartUiState

}