package mobi.appcent.store.ui.screen.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Close
import androidx.compose.material.icons.rounded.FavoriteBorder
import androidx.compose.material.icons.rounded.NotificationsNone
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material.icons.rounded.Sick
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import mobi.appcent.store.R
import mobi.appcent.store.data.model.Product
import mobi.appcent.store.data.model.ProductTag
import mobi.appcent.store.ui.components.AppTopBar
import mobi.appcent.store.ui.components.ProductList
import mobi.appcent.store.ui.components.SquaredIconButton
import mobi.appcent.store.ui.screen.home.HomeUiState
import mobi.appcent.store.ui.screen.home.HomeViewModel
import mobi.appcent.store.ui.theme.outerSpace
import mobi.appcent.store.ui.theme.red

/**
 * Created by erenalpaslan on 21.04.2023
 */
@Composable
fun HomeContent(
    uiState: HomeUiState,
    viewModel: HomeViewModel
) {
    Scaffold(
        topBar = {
            AppTopBar(
                actions = {
                    SquaredIconButton(icon = {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_fav),
                            contentDescription = "Favorites"
                        )
                    }) {

                    }
                    Spacer(modifier = Modifier.width(8.dp))
                },
                title = {
                    Text(text = "Appcent", style = MaterialTheme.typography.titleMedium)
                },
                navigationIcon = {
                    /*Row {
                        Spacer(modifier = Modifier.width(8.dp))
                        SquaredIconButton(icon = {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_menu),
                                contentDescription = "Menu"
                            )
                        }) {

                        }
                    }*/
                },
            )
        }
    ) {
        Column(modifier = Modifier
            .padding(top = it.calculateTopPadding())
        ) {
            HomeHeader(
                onSearchTextChanged = { searchText ->

                }
            )
            HomeTagList(
                list = listOf(
                    ProductTag("All"),
                    ProductTag("Newest"),
                    ProductTag("Popular"),
                    ProductTag("Man"),
                    ProductTag("Woman")
                ),
                onTagSelectionChanged = { selectedTag ->

                }
            )
            ProductList(
                list = listOf(
                    Product("https://picsum.photos/seed/picsum/200/300", 300),
                    Product("https://picsum.photos/seed/picsum/200/300", 200),
                    Product("https://picsum.photos/seed/picsum/200/300", 200),
                    Product("https://picsum.photos/seed/picsum/200/300", 100),
                    Product("https://picsum.photos/seed/picsum/200/300", 300),
                    Product("https://picsum.photos/seed/picsum/200/300", 300),
                ),
                onClick = {product ->
                    viewModel.onProductDetailClicked(product)
                }
            )
        }
    }
}