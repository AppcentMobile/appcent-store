package mobi.appcent.store.ui.screen.signup

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import com.google.accompanist.navigation.animation.composable
import mobi.appcent.store.core.navigation.AppNavigator
import mobi.appcent.store.core.navigation.screen.Routes
import mobi.appcent.store.ui.screen.getstarted.GetStartedScreen
import mobi.appcent.store.ui.screen.login.popLogin
import org.koin.androidx.compose.koinViewModel

/**
 * Created by erenalpaslan on 30.05.2023
 */
fun AppNavigator.navigateToSignup() {
    this.navigate(Routes.signUpRoute)
}

fun AppNavigator.popSignup() {
    this.popUpTo(Routes.signUpRoute, Routes.getStartedRoute, true)
}

@OptIn(ExperimentalAnimationApi::class)
fun NavGraphBuilder.signUpScreen(navigator: AppNavigator) {
    composable(route = Routes.signUpRoute) {
        SignupScreen().Create(
            navigator = navigator,
            viewModel = koinViewModel()
        )
    }
}