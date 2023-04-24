package mobi.appcent.store.ui.screen.favorites

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.navigation.NavGraphBuilder
import com.google.accompanist.navigation.animation.composable
import mobi.appcent.store.core.navigation.AppNavigator
import mobi.appcent.store.core.navigation.screen.Routes
import org.koin.androidx.compose.koinViewModel

/**
 * Created by erenalpaslan on 21.04.2023
 */
fun AppNavigator.navigateToCatalog() {
    this.navigate(Routes.favoritesRoute)
}

@OptIn(ExperimentalAnimationApi::class)
fun NavGraphBuilder.favoritesScreen(navigator: AppNavigator) {
    composable(route = Routes.favoritesRoute) {
        FavoritesScreen().Create(
            navigator = navigator,
            viewModel = koinViewModel()
        )
    }
}