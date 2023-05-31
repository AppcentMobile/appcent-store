package mobi.appcent.store.ui.screen.main

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.google.accompanist.navigation.animation.AnimatedNavHost
import mobi.appcent.store.core.navigation.AppNavigator
import mobi.appcent.store.core.navigation.screen.Routes
import mobi.appcent.store.ui.screen.cart.cartScreen
import mobi.appcent.store.ui.screen.collections.favoritesScreen
import mobi.appcent.store.ui.screen.getstarted.getStartedScreen
import mobi.appcent.store.ui.screen.home.homeScreen
import mobi.appcent.store.ui.screen.login.loginScreen
import mobi.appcent.store.ui.screen.onboarding.onBoardingScreen
import mobi.appcent.store.ui.screen.productdetail.productDetailScreen
import mobi.appcent.store.ui.screen.profile.profileScreen
import mobi.appcent.store.ui.screen.signup.signUpScreen
import mobi.appcent.store.ui.screen.splash.splashScreen

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun MainNavHost(
    navigator: AppNavigator,
    navController: NavHostController,
    paddingValues: PaddingValues
) {
    AnimatedNavHost(
        navController = navController,
        startDestination = Routes.splashRoute,
        modifier = Modifier.padding(
            bottom = paddingValues.calculateBottomPadding()
        )
    ) {
        splashScreen(navigator)
        homeScreen(navigator)
        favoritesScreen(navigator)
        cartScreen(navigator)
        profileScreen(navigator)
        productDetailScreen(navigator)
        onBoardingScreen(navigator)
        getStartedScreen(navigator)
        loginScreen(navigator)
        signUpScreen(navigator)
    }
}