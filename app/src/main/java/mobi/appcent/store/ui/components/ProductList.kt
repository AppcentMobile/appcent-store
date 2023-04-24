package mobi.appcent.store.ui.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import mobi.appcent.store.data.model.Product

/**
 * Created by erenalpaslan on 24.04.2023
 */
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ProductList(
    modifier: Modifier = Modifier,
    list: List<Product>,
    onClick: (Product) -> Unit
) {
    Column {
        LazyVerticalStaggeredGrid(
            modifier = modifier.fillMaxWidth()
                .padding(horizontal = 12.dp),
            columns = StaggeredGridCells.Fixed(2),
            contentPadding = PaddingValues(8.dp)
        ) {
            items(list) {item ->
                ProductListItem(item) {
                    onClick(item)
                }
            }
        }
    }

}