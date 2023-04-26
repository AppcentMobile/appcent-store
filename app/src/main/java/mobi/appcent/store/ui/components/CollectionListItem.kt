package mobi.appcent.store.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

/**
 * Created by erenalpaslan on 26.04.2023
 */
@Composable
fun CollectionListItem(
    collection: String,
    onCLick: () -> Unit
) {
    AsyncImage(
        model = collection,
        contentDescription = "",
        modifier = Modifier
            .fillMaxSize()
            .defaultMinSize(minHeight = 200.dp)
            .padding(4.dp)
            .clip(RoundedCornerShape(16.dp))
            .clickable {
                onCLick()
            },
        contentScale = ContentScale.Crop,
    )
}
