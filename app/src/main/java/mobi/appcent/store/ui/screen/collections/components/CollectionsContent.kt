package mobi.appcent.store.ui.screen.collections.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import mobi.appcent.store.ui.screen.collections.CollectionsUiState

/**
 * Created by erenalpaslan on 21.04.2023
 */
@Composable
fun CollectionsContent(
    uiState: CollectionsUiState
) {
    Scaffold {
        Column(modifier = Modifier.padding(top = it.calculateTopPadding())) {
            when(uiState) {
                is CollectionsUiState.CollectionsLoaded -> {
                    CollectionsList(
                        collections = uiState.list,
                        onCollectionClicked = {collection ->
                            /* TODO: Open collection detail */
                        }
                    )
                }
                CollectionsUiState.Loading -> {}
            }
        }
    }
}