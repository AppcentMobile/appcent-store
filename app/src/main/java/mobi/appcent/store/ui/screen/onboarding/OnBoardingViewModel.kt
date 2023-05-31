package mobi.appcent.store.ui.screen.onboarding

import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import mobi.appcent.core.preferences.PreferencesKeys
import mobi.appcent.core.preferences.PreferencesManager
import mobi.appcent.store.common.base.BaseViewModel
import mobi.appcent.store.core.navigation.AppNavigator
import mobi.appcent.store.core.navigation.screen.Routes
import mobi.appcent.store.ui.screen.getstarted.navigateToGetStarted
import mobi.appcent.store.ui.screen.home.navigateToHome

/**
 * Created by erenalpaslan on 2.05.2023
 */
class OnBoardingViewModel(
    private val navigator: AppNavigator
): BaseViewModel() {

    fun onGetStartedClicked() {
        viewModelScope.launch {
            navigator.navigateToGetStarted()
        }
    }

}