package mobi.appcent.store.ui.screen.getstarted

import androidx.compose.runtime.Composable
import mobi.appcent.store.common.base.BaseScreen
import mobi.appcent.store.ui.screen.getstarted.component.GetStartedContent

/**
 * Created by erenalpaslan on 30.05.2023
 */
class GetStartedScreen: BaseScreen<GetStartedViewModel>() {
    @Composable
    override fun Screen() {
        GetStartedContent(navigator)
    }
}