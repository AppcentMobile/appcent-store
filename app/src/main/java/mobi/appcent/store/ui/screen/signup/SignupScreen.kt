package mobi.appcent.store.ui.screen.signup

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
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
        val onRegisterSuccess by viewModel.onRegisterSuccess.observeAsState()

        LaunchedEffect(key1 = onRegisterSuccess) {
            onRegisterSuccess?.getContentIfNotHandled().let {success ->
                if (success == true) {
                    navigator.navigateToHome()
                }
            }
        }

        SignupContent(
            viewModel = viewModel,
            onSignupClicked = {
                viewModel.onRegisterClicked()
            },
            onLoginClicked = {
                navigator.popLogin()
            }
        )
    }
}