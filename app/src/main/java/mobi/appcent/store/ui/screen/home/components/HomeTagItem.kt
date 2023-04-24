package mobi.appcent.store.ui.screen.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import mobi.appcent.store.data.model.ProductTag

/**
 * Created by erenalpaslan on 24.04.2023
 */
@Composable
fun HomeTagItem(
    tag: ProductTag,
    selected: Boolean,
    onClick: (ProductTag) -> Unit
) {
    Card(
        onClick = {
            onClick(tag)
        },
        colors = CardDefaults.cardColors(containerColor = Color.Transparent)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(horizontal = 8.dp)
        ) {
            Box(
                modifier = Modifier
                    .clip(CircleShape)
                    .background(if (selected) MaterialTheme.colorScheme.primary else Color.Transparent)
                    .size(6.dp)
            )
            Spacer(modifier = Modifier.width(4.dp))
            Text(
                text = tag.name,
                style = MaterialTheme.typography.labelLarge
            )
        }
    }
}
