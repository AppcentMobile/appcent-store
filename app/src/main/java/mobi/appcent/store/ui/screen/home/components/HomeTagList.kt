package mobi.appcent.store.ui.screen.home.components

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.valentinilk.shimmer.Shimmer
import com.valentinilk.shimmer.defaultShimmerTheme
import com.valentinilk.shimmer.shimmer
import mobi.appcent.medusa.store.model.response.ProductCollection
import mobi.appcent.store.data.model.ProductTag

/**
 * Created by erenalpaslan on 24.04.2023
 */
@Composable
fun HomeTagList(
    isLoading: Boolean = false,
    list: List<ProductCollection>,
    onTagSelectionChanged: (ProductCollection) -> Unit
) {
    var selectedTag by remember {
        mutableStateOf<ProductCollection?>(null)
    }
    when(isLoading) {
        true -> LoadingCollections()
        false -> HomeTagListContent(
            list = list,
            selectedTag = selectedTag,
            onTagSelectionChanged = { tag ->
                selectedTag = tag
                onTagSelectionChanged(tag)
            })
    }
}

@Composable
fun HomeTagListContent(
    list: List<ProductCollection>,
    selectedTag: ProductCollection?,
    onTagSelectionChanged: (ProductCollection) -> Unit
) {
    Column {
        Spacer(modifier = Modifier.height(8.dp))
        LazyRow(
            contentPadding = PaddingValues(horizontal = 8.dp)
        ) {
            itemsIndexed(list) {index, item ->
                HomeTagItem(
                    tag = item,
                    selected = item.id == selectedTag?.id
                ) {tag ->
                    tag?.let(onTagSelectionChanged)
                }
            }
        }
    }
}

@Composable
fun LoadingCollections() {
    Row(modifier = Modifier.padding(horizontal = 16.dp, vertical = 16.dp)
        .shimmer()) {
        Box(
            modifier = Modifier
                .width(32.dp)
                .height(12.dp)
                .clip(RoundedCornerShape(24.dp))
                .background(MaterialTheme.colorScheme.onBackground),
        )
        Spacer(modifier = Modifier.width(4.dp))
        Box(
            modifier = Modifier
                .width(32.dp)
                .height(12.dp)
                .clip(RoundedCornerShape(24.dp))
                .background(MaterialTheme.colorScheme.onBackground),
        )
        Spacer(modifier = Modifier.width(4.dp))
        Box(
            modifier = Modifier
                .width(32.dp)
                .height(12.dp)
                .clip(RoundedCornerShape(24.dp))
                .background(MaterialTheme.colorScheme.onBackground),
        )
        Spacer(modifier = Modifier.width(4.dp))
        Box(
            modifier = Modifier
                .width(32.dp)
                .height(12.dp)
                .clip(RoundedCornerShape(24.dp))
                .background(MaterialTheme.colorScheme.onBackground),
        )
    }
}