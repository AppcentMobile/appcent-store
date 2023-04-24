package mobi.appcent.store.ui.screen.splash

import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import mobi.appcent.store.common.base.BaseViewModel
import mobi.appcent.store.core.navigation.AppNavigator
import mobi.appcent.store.core.navigation.screen.Routes
import mobi.appcent.store.ui.screen.home.navigateToHome

/**
 * Created by erenalpaslan on 21.04.2023
 */
class SplashViewModel(
    private val navigator: AppNavigator
): BaseViewModel() {

    init {
        viewModelScope.launch {
            delay(1_000L)
            navigator.navigateToHome()
        }
    }

}