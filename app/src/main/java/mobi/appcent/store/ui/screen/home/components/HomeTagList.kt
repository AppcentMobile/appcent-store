package mobi.appcent.store.ui.screen.home.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import mobi.appcent.store.data.model.ProductTag

/**
 * Created by erenalpaslan on 24.04.2023
 */
@Composable
fun HomeTagList(
    list: List<ProductTag>,
    onTagSelectionChanged: (ProductTag) -> Unit
) {
    var selectedTag by remember {
        mutableStateOf(list[0])
    }
    Column {
        Spacer(modifier = Modifier.height(8.dp))
        LazyRow(
            contentPadding = PaddingValues(horizontal = 8.dp)
        ) {
            itemsIndexed(list) {index, item ->
                HomeTagItem(
                    tag = item,
                    selected = item.name == selectedTag.name
                ) {tag ->
                    selectedTag = tag
                    onTagSelectionChanged(tag)
                }
            }
        }
    }
}