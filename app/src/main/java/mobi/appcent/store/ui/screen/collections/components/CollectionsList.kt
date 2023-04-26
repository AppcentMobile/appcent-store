package mobi.appcent.store.ui.screen.collections.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import mobi.appcent.store.ui.components.CollectionListItem

/**
 * Created by erenalpaslan on 26.04.2023
 */
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun CollectionsList(
    collections: List<String>,
    onCollectionClicked: (String) -> Unit
) {
    LazyVerticalStaggeredGrid(
        modifier = Modifier.fillMaxWidth()
            .padding(horizontal = 12.dp),
        columns = StaggeredGridCells.Fixed(2),
        contentPadding = PaddingValues(8.dp)
    ) {
        items(collections) {collection ->
            CollectionListItem(
                collection = collection
            ) {
                onCollectionClicked(collection)
            }
        }
    }
}
