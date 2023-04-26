package mobi.appcent.store.ui.screen.cart

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import mobi.appcent.store.common.base.BaseScreen
import mobi.appcent.store.ui.components.AppTopBar
import mobi.appcent.store.ui.components.SquaredIconButton

/**
 * Created by erenalpaslan on 21.04.2023
 */
class CartScreen(): BaseScreen<CartViewModel>() {
    @Composable
    override fun Screen() {
        val uiState by viewModel.uiState.collectAsState()

        CartContent(
            uiState = uiState,
            onCheckoutClicked = {  },
            onItemRemoved = {  },
            onItemQuantityChanged = {product, quantity ->

            },
            onShippingAddressChangeClicked = { /*TODO*/ },
            onPaymentMethodChangeClicked = {}
        )
    }
}