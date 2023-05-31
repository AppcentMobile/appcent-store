package mobi.appcent.store.ui.screen.splash

import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import mobi.appcent.core.preferences.PreferencesKeys
import mobi.appcent.core.preferences.PreferencesManager
import mobi.appcent.store.common.base.BaseViewModel
import mobi.appcent.store.core.navigation.AppNavigator
import mobi.appcent.store.core.navigation.screen.Routes
import mobi.appcent.store.ui.screen.home.navigateToHome
import mobi.appcent.store.ui.screen.onboarding.navigateToOnBoarding

/**
 * Created by erenalpaslan on 21.04.2023
 */
class SplashViewModel(
    private val navigator: AppNavigator,
    private val preferencesManager: PreferencesManager
): BaseViewModel() {

    init {
        viewModelScope.launch {
            val isFirstEnter = preferencesManager.getBoolean(PreferencesKeys.IS_FIRST_ENTER, true)
            if (isFirstEnter) {
                navigator.navigateToOnBoarding()
            }else {
                navigator.navigateToHome()
            }
        }
    }

}