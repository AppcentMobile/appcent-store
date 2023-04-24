package mobi.appcent.store.ui.screen.favorites

import androidx.compose.runtime.Composable
import mobi.appcent.store.common.base.BaseScreen
import mobi.appcent.store.ui.screen.favorites.components.FavoritesContent

/**
 * Created by erenalpaslan on 21.04.2023
 */
class FavoritesScreen: BaseScreen<FavoritesViewModel>() {
    @Composable
    override fun Screen() {
        FavoritesContent()
    }

}