package mobi.appcent.store.ui.screen.splash

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import com.google.accompanist.navigation.animation.composable
import mobi.appcent.store.core.navigation.AppNavigator
import mobi.appcent.store.core.navigation.screen.Routes
import org.koin.androidx.compose.koinViewModel

/**
 * Created by erenalpaslan on 21.04.2023
 */
fun NavController.navigateToSplash(navOptions: NavOptions? = null) {
    this.navigate(Routes.splashRoute, navOptions)
}

@OptIn(ExperimentalAnimationApi::class)
fun NavGraphBuilder.splashScreen(navigator: AppNavigator) {
    composable(route = Routes.splashRoute) {
        SplashScreen().Create(
            navigator = navigator,
            viewModel = koinViewModel()
        )
    }
}