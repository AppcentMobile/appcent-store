package mobi.appcent.store.ui.screen.cart.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import mobi.appcent.store.R

/**
 * Created by erenalpaslan on 25.04.2023
 */
@Composable
fun CartEmptyList() {
    Column(
        modifier = Modifier.fillMaxSize()
            .padding(vertical = 32.dp, horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_shopping_cart),
            contentDescription = "Shopping Cart"
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Your cart is empty",
            style = MaterialTheme.typography.headlineLarge,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Your cart is empty. Shop our products and add items to your cart to proceed to checkout. Contact us if you need any help.",
            textAlign = TextAlign.Center
        )
    }
}
