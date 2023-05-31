package mobi.appcent.store.ui.screen.login

import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import mobi.appcent.store.common.base.BaseViewModel
import mobi.appcent.store.core.navigation.AppNavigator
import mobi.appcent.store.ui.screen.signup.navigateToSignup

/**
 * Created by erenalpaslan on 30.05.2023
 */
class LoginViewModel(
    private val navigator: AppNavigator
): BaseViewModel() {

    fun onLoginClicked() {
        viewModelScope.launch {

        }
    }

    fun onRegisterClicked() {
        viewModelScope.launch {
            navigator.navigateToSignup()
        }
    }

}