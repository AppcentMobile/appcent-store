package mobi.appcent.store.ui.screen.main

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import mobi.appcent.store.R
import mobi.appcent.store.core.navigation.AppNavigator
import mobi.appcent.store.core.navigation.screen.Routes

/**
 * Created by erenalpaslan on 10.02.2023
 */
enum class BottomNavigationScreens(
    @DrawableRes val icon: Int,
    @DrawableRes val selectedIcon: Int,
    val label: String,
    val route: String
) {
    HOME(
        icon = R.drawable.ic_home,
        selectedIcon = R.drawable.ic_home,
        label = "Home",
        route = Routes.homeRoute
    ),
    CART(
        icon = R.drawable.ic_cart,
        selectedIcon = R.drawable.ic_cart,
        label = "Cart",
        route = Routes.cartRoute
    ),
    FAVORITES(
        icon = R.drawable.ic_fav,
        selectedIcon = R.drawable.ic_fav,
        label = "Favorites",
        route = Routes.favoritesRoute
    ),
    SETTINGS(
        icon = R.drawable.ic_setting,
        selectedIcon =  R.drawable.ic_setting,
        label = "Setting",
        route = Routes.settingRoute
    )
}

@Composable
fun BottomNavigation(
    currentRoute: String?,
    navigator: AppNavigator,
) {
    val navigateToBottomTabs: (String) -> Unit = {
        navigator.navigate(it) {
            if (currentRoute != null) {
                popUpTo(currentRoute) {
                    inclusive = true
                }
            }
        }
    }

    if (currentRoute in BottomNavRoutes.routes) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .navigationBarsPadding(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            BottomNavigationScreens.values().forEach { screen ->
                BottomNavigationItem(
                    selected = currentRoute == screen.route,
                    onClick = {
                        navigateToBottomTabs(screen.route)
                    },
                    label = screen.label,
                    icon = screen.icon,
                    selectedIcon = screen.selectedIcon,
                    badge = {
                        if (screen.route == Routes.cartRoute) {
                            Badge {
                                Text(text = "2")
                            }
                        }
                    }
                )
            }

        }
    }
}

object BottomNavRoutes {
    val routes = listOf(
        Routes.homeRoute,
        Routes.cartRoute,
        Routes.favoritesRoute,
        Routes.settingRoute
    )
}

@Composable
fun BottomNavigationItem(
    selected: Boolean,
    onClick: () -> Unit,
    label: String,
    @DrawableRes icon: Int,
    @DrawableRes selectedIcon: Int,
    badge: @Composable () -> Unit = {}
) {
    Box (contentAlignment = Alignment.TopEnd){
        IconButton(onClick = {
            onClick()
        }) {
            Icon(
                painter = painterResource(id = if (selected) selectedIcon else icon),
                contentDescription = label,
                tint = LocalContentColor.current.copy(alpha = if (selected) 1f else 0.2f)
            )
        }
        badge()
    }
}