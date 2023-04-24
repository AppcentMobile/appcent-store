package mobi.appcent.store.ui.screen.home

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.navigation.NavGraphBuilder
import com.google.accompanist.navigation.animation.composable
import mobi.appcent.store.core.navigation.AppNavigator
import mobi.appcent.store.core.navigation.screen.Routes
import org.koin.androidx.compose.koinViewModel

/**
 * Created by erenalpaslan on 21.04.2023
 */
fun AppNavigator.navigateToHome() {
    this.navigate(Routes.homeRoute) {
        popUpTo(Routes.splashRoute) {
            inclusive = true
        }
        launchSingleTop = true
    }
}

@OptIn(ExperimentalAnimationApi::class)
fun NavGraphBuilder.homeScreen(navigator: AppNavigator) {
    composable(route = Routes.homeRoute) {
        HomeScreen().Create(
            navigator = navigator,
            viewModel = koinViewModel()
        )
    }
}