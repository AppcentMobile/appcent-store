package mobi.appcent.store.ui.screen.signup

import androidx.compose.runtime.Composable
import mobi.appcent.store.common.base.BaseScreen
import mobi.appcent.store.ui.screen.home.navigateToHome
import mobi.appcent.store.ui.screen.login.popLogin
import mobi.appcent.store.ui.screen.signup.components.SignupContent

/**
 * Created by erenalpaslan on 30.05.2023
 */
class SignupScreen: BaseScreen<SignupViewModel>() {
    @Composable
    override fun Screen() {
        SignupContent(
            onSignupClicked = {
                navigator.navigateToHome()
            },
            onLoginClicked = {
                navigator.popLogin()
            }
        )
    }
}