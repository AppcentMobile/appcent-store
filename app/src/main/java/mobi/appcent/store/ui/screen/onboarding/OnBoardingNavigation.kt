package mobi.appcent.store.ui.screen.onboarding

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.navigation.NavGraphBuilder
import com.google.accompanist.navigation.animation.composable
import mobi.appcent.store.core.navigation.AppNavigator
import mobi.appcent.store.core.navigation.screen.Routes
import org.koin.androidx.compose.koinViewModel

/**
 * Created by erenalpaslan on 23.05.2023
 */
fun AppNavigator.navigateToOnBoarding() {
    this.popUpTo(Routes.onBoardingRoute, Routes.splashRoute, true)
}

@OptIn(ExperimentalAnimationApi::class)
fun NavGraphBuilder.onBoardingScreen(navigator: AppNavigator) {
    composable(route = Routes.onBoardingRoute) {
        OnBoardingScreen().Create(
            navigator = navigator,
            viewModel = koinViewModel()
        )
    }
}