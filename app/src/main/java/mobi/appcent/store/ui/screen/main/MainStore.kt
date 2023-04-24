package mobi.appcent.store.ui.screen.main

import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import kotlinx.coroutines.launch
import mobi.appcent.store.core.navigation.AppNavigator
import mobi.appcent.store.core.navigation.screen.Routes

/**
 * Created by erenalpaslan on 21.04.2023
 */
@Composable
fun MainStore(
    viewModel: MainViewModel,
    navController: NavHostController,
    navigator: AppNavigator
) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    Scaffold(
        bottomBar = {
            BottomNavigation(
                currentRoute = currentDestination?.route,
                navigator = navigator
            )
        }
    ) {
        MainNavHost(
            navigator = navigator,
            navController = navController,
            paddingValues = it
        )
    }
}

