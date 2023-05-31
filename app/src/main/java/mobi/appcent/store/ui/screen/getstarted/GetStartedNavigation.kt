package mobi.appcent.store.ui.screen.getstarted

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.navigation.NavGraphBuilder
import com.google.accompanist.navigation.animation.composable
import mobi.appcent.store.core.navigation.AppNavigator
import mobi.appcent.store.core.navigation.screen.Routes
import org.koin.androidx.compose.koinViewModel

/**
 * Created by erenalpaslan on 30.05.2023
 */
fun AppNavigator.navigateToGetStarted() {
    this.popUpTo(Routes.getStartedRoute, Routes.onBoardingRoute, true)
}

@OptIn(ExperimentalAnimationApi::class)
fun NavGraphBuilder.getStartedScreen(navigator: AppNavigator) {
    composable(route = Routes.getStartedRoute) {
        GetStartedScreen().Create(
            navigator = navigator,
            viewModel = koinViewModel()
        )
    }
}