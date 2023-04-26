package mobi.appcent.store.ui.screen.cart.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import mobi.appcent.store.R
import mobi.appcent.store.data.model.Product
import mobi.appcent.store.ui.screen.cart.CartUiState
import mobi.appcent.store.ui.theme.arsenic
import mobi.appcent.store.ui.theme.black
import mobi.appcent.store.ui.theme.cultured
import mobi.appcent.store.ui.theme.outerSpace

/**
 * Created by erenalpaslan on 25.04.2023
 */
@Composable
fun UserCartList(
    userCart: CartUiState.UserCart,
    onRemoveClicked: (Product) -> Unit
) {
    Column {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .weight(1f)
        ) {
            items(userCart.list) { product ->
                CartListItem(product = product)
            }
        }
        Spacer(modifier = Modifier.height(8.dp))
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .clip(RoundedCornerShape(24.dp, 24.dp))
                .background(black),
        ) {
            Spacer(modifier = Modifier.height(24.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Total:",
                    style = MaterialTheme.typography.headlineLarge
                )
                Text(
                    text = "${userCart.totalAmount} ₺",
                    style = MaterialTheme.typography.headlineLarge
                )
            }
            Text(
                text = "total quantity: ${userCart.totalItemCount}",
                style = MaterialTheme.typography.labelMedium,
                modifier = Modifier.padding(horizontal = 16.dp)
            )
            Spacer(modifier = Modifier.height(8.dp))
            Divider()
            Spacer(modifier = Modifier.height(8.dp))
            Row(
                modifier = Modifier.padding(horizontal = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Shipping Address",
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.width(8.dp))
                Icon(painter = painterResource(id = R.drawable.ic_truck), contentDescription = "")
            }
            Spacer(modifier = Modifier.height(4.dp))
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(horizontal = 16.dp)
            ) {
                Text(
                    text = "Shipping detail ... ... ... .. .. . . .", modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                )
                OutlinedButton(onClick = {

                }) {
                    Text(text = "Change")
                }
            }
            Spacer(modifier = Modifier.height(8.dp))
            Divider()
            Spacer(modifier = Modifier.height(8.dp))
            Row(
                modifier = Modifier.padding(horizontal = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Payment Method",
                    style = MaterialTheme.typography.bodyLarge,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.width(8.dp))
                Icon(painter = painterResource(id = R.drawable.ic_barcode), contentDescription = "")
            }
            Spacer(modifier = Modifier.height(4.dp))
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(horizontal = 16.dp)
            ) {
                Text(
                    text = ".... .... .... 1234", modifier = Modifier
                        .fillMaxWidth()
                        .weight(1f)
                )

                OutlinedButton(onClick = {

                }) {
                    Text(text = "Change")
                }
            }
            Button(
                onClick = {
                    /*TODO*/
                },
                shape = MaterialTheme.shapes.medium,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 32.dp)
            ) {
                Text(text = "Checkout")
            }
        }
    }

}
