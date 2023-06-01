package mobi.appcent.store.ui.screen.login

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import mobi.appcent.store.common.base.BaseScreen
import mobi.appcent.store.ui.screen.home.navigateToHome
import mobi.appcent.store.ui.screen.login.components.LoginContent
import mobi.appcent.store.ui.screen.signup.navigateToSignup

/**
 * Created by erenalpaslan on 30.05.2023
 */
class LoginScreen : BaseScreen<LoginViewModel>() {
    @Composable
    override fun Screen() {
        val onLoginSuccess by viewModel.onLoginSuccess.observeAsState()

        LaunchedEffect(key1 = onLoginSuccess) {
            onLoginSuccess?.getContentIfNotHandled()?.let { success ->
                if (success) {
                    navigator.navigateToHome()
                }
            }
        }

        LoginContent(
            viewModel = viewModel,
            onLoginClicked = {
                viewModel.onLoginClicked()
            },
            onForgotPasswordClicked = {

            },
            onSignupClicked = {
                navigator.navigateToSignup()
            }
        )
    }
}