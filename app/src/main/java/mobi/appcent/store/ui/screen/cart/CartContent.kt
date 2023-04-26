package mobi.appcent.store.ui.screen.cart

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import mobi.appcent.store.R
import mobi.appcent.store.data.model.Product
import mobi.appcent.store.ui.components.AppTopBar
import mobi.appcent.store.ui.components.SquaredIconButton
import mobi.appcent.store.ui.screen.cart.components.CartEmptyList
import mobi.appcent.store.ui.screen.cart.components.UserCartList

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
            AppTopBar(
                actions = {
                    if (uiState is CartUiState.UserCart) {
                        Button(
                            onClick = {
                                onCheckoutClicked()
                            },
                            shape = MaterialTheme.shapes.medium
                        ) {
                            Text(text = "Checkout")
                            Spacer(modifier = Modifier.padding(8.dp))
                            Icon(
                                painter = painterResource(id = R.drawable.ic_arrow_right),
                                contentDescription = "Arrow right"
                            )
                        }
                    }
                }
            )
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
