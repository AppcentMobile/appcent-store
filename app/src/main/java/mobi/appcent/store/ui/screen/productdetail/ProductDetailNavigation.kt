package mobi.appcent.store.ui.screen.productdetail

import androidx.compose.animation.AnimatedContentScope
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import androidx.navigation.NavGraphBuilder
import com.google.accompanist.navigation.animation.composable
import mobi.appcent.store.core.navigation.AppNavigator
import mobi.appcent.store.core.navigation.screen.Routes
import mobi.appcent.store.ui.screen.profile.ProfileScreen
import org.koin.androidx.compose.koinViewModel

/**
 * Created by erenalpaslan on 26.04.2023
 */
@OptIn(ExperimentalAnimationApi::class)
fun NavGraphBuilder.productDetailScreen(navigator: AppNavigator) {
    composable(
        route = Routes.productDetailRoute,
        enterTransition = {
            slideIntoContainer(AnimatedContentScope.SlideDirection.Left, animationSpec = tween(700))
        },
        exitTransition = {
            slideOutOfContainer(AnimatedContentScope.SlideDirection.Right, animationSpec = tween(700))
        },
        popEnterTransition = {
            slideIntoContainer(AnimatedContentScope.SlideDirection.Left, animationSpec = tween(1000))
        },
        popExitTransition = {
            slideOutOfContainer(AnimatedContentScope.SlideDirection.Right, animationSpec = tween(1000))
        }
    ) {
        ProductDetailScreen().Create(
            navigator = navigator,
            viewModel = koinViewModel()
        )
    }
}