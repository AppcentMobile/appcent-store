package mobi.appcent.store.ui.screen.login

import androidx.compose.runtime.Composable
import mobi.appcent.store.common.base.BaseScreen
import mobi.appcent.store.ui.screen.login.components.LoginContent

/**
 * Created by erenalpaslan on 30.05.2023
 */
class LoginScreen : BaseScreen<LoginViewModel>() {
    @Composable
    override fun Screen() {
        LoginContent(
            onLoginClicked = {},
            onForgotPasswordClicked = {},
            onSignupClicked = { viewModel.onRegisterClicked() }
        )
    }
}