package mobi.appcent.store.ui.screen.profile.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import mobi.appcent.store.R
import mobi.appcent.store.core.navigation.AppNavigator
import mobi.appcent.store.ui.components.AppTopBar
import mobi.appcent.store.ui.components.NavigationButton
import mobi.appcent.store.ui.screen.profile.ProfileUiState

/**
 * Created by erenalpaslan on 26.04.2023
 */
@Composable
fun ProfileContent(
    uiState: ProfileUiState,
    onLogoutClicked: () -> Unit
) {
    Scaffold(
        topBar = {
            AppTopBar()
        }
    ) {
        Column(
            modifier = Modifier.padding(top = it.calculateTopPadding()),
        ) {
            Column(modifier = Modifier.padding(horizontal = 16.dp)) {
                Text(text = "Welcome", style = MaterialTheme.typography.headlineLarge)
                Text(
                    text = uiState.name ?: "",
                    style = MaterialTheme.typography.headlineSmall,
                    color = MaterialTheme.colorScheme.primary
                )
            }
            Spacer(modifier = Modifier.height(32.dp))
            NavigationButton(
                title = "Shipping Address",
                description = "Shipping Address detail ... ... ... .."
            ) {

            }
            NavigationButton(
                title = "Payment Method",
                description = "Change your payment method"
            ) {

            }
            NavigationButton(
                title = "Orders",
                description = "See all given orders"
            ) {

            }
            Spacer(modifier = Modifier.height(32.dp))
            OutlinedButton(
                onClick = onLogoutClicked,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            ) {
                Text(text = "Logout")
            }
        }
    }
}
