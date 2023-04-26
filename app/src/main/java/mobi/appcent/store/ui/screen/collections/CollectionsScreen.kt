package mobi.appcent.store.ui.screen.collections

import androidx.compose.runtime.Composable
import mobi.appcent.store.common.base.BaseScreen
import mobi.appcent.store.ui.screen.collections.components.CollectionsContent

/**
 * Created by erenalpaslan on 21.04.2023
 */
class CollectionsScreen: BaseScreen<CollectionsViewModel>() {
    @Composable
    override fun Screen() {
        CollectionsContent()
    }

}