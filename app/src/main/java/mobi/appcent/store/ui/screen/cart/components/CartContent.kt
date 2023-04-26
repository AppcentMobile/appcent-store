package mobi.appcent.store.ui.screen.cart.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import mobi.appcent.store.data.model.Product
import mobi.appcent.store.ui.components.AppTopBar
import mobi.appcent.store.ui.screen.cart.CartUiState

/**
 * Created by erenalpaslan on 25.04.2023
 */
@Composable
fun CartContent(
    uiState: CartUiState,
    onCheckoutClicked: () -> Unit,
    onItemRemoved: (Product) -> Unit,
    onItemQuantityChanged: (Product, Int) -> Unit,
    onShippingAddressChangeClicked: () -> Unit,
    onPaymentMethodChangeClicked: () -> Unit
) {
    Scaffold(
        topBar = {
            AppTopBar()
        }
    ) {
        Column(modifier = Modifier.padding(top = it.calculateTopPadding())) {
            when(uiState) {
                CartUiState.Empty -> CartEmptyList()
                CartUiState.Loading -> {}
                is CartUiState.UserCart -> UserCartList(
                    userCart = uiState,
                    onRemoveClicked = {product ->
                        onItemRemoved(product)
                    }
                )
            }
        }
    }
}
