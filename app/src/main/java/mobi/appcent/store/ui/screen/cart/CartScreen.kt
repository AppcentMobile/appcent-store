package mobi.appcent.store.ui.screen.cart

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import mobi.appcent.store.common.base.BaseScreen

/**
 * Created by erenalpaslan on 21.04.2023
 */
class CartScreen: BaseScreen<CartViewModel>() {
    @Composable
    override fun Screen() {
        Scaffold {
            Column(modifier = Modifier.padding(it)) {
                Text(text = "Cart")
            }
        }
    }
}