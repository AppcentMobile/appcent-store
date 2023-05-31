package mobi.appcent.store.ui.screen.login

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.navigation.NavGraphBuilder
import com.google.accompanist.navigation.animation.composable
import mobi.appcent.store.core.navigation.AppNavigator
import mobi.appcent.store.core.navigation.screen.Routes
import mobi.appcent.store.ui.screen.getstarted.GetStartedScreen
import mobi.appcent.store.ui.screen.getstarted.navigateToGetStarted
import org.koin.androidx.compose.koinViewModel

/**
 * Created by erenalpaslan on 30.05.2023
 */
fun AppNavigator.popLogin() {
    this.popUpTo(Routes.loginRoute, Routes.getStartedRoute, true)
}

@OptIn(ExperimentalAnimationApi::class)
fun NavGraphBuilder.loginScreen(navigator: AppNavigator) {
    composable(route = Routes.loginRoute) {
        LoginScreen().Create(
            navigator = navigator,
            viewModel = koinViewModel()
        )
    }
}
