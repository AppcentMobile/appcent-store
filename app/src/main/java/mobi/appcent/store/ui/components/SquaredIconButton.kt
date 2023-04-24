package mobi.appcent.store.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import mobi.appcent.store.R
import mobi.appcent.store.ui.theme.outerSpace

/**
 * Created by erenalpaslan on 24.04.2023
 */
@Composable
fun SquaredIconButton(
    icon: @Composable () -> Unit,
    onClick: () -> Unit
) {
    Card(
        onClick = {
            onClick()
        },
        colors = CardDefaults.cardColors(
            containerColor = outerSpace
        ),
        shape = MaterialTheme.shapes.medium,
        modifier = Modifier.size(44.dp)
    ) {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            icon()
        }
    }
}