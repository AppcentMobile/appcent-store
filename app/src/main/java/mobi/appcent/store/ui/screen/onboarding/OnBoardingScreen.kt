package mobi.appcent.store.ui.screen.onboarding

import androidx.compose.runtime.Composable
import mobi.appcent.store.common.base.BaseScreen
import mobi.appcent.store.ui.screen.onboarding.components.OnBoardingContent

/**
 * Created by erenalpaslan on 2.05.2023
 */
class OnBoardingScreen : BaseScreen<OnBoardingViewModel>() {
    @Composable
    override fun Screen() {
        OnBoardingContent(
            viewModel
        )
    }
}