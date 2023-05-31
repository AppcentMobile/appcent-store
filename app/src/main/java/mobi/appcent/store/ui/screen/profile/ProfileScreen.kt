package mobi.appcent.store.ui.screen.profile

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import mobi.appcent.store.common.base.BaseScreen
import mobi.appcent.store.ui.screen.getstarted.navigateToGetStarted
import mobi.appcent.store.ui.screen.profile.components.ProfileContent

/**
 * Created by erenalpaslan on 21.04.2023
 */
class ProfileScreen: BaseScreen<ProfileViewModel>() {
    @Composable
    override fun Screen() {
        val uiState by viewModel.uiState.collectAsState()

        ProfileContent(
            uiState = uiState,
            onLogoutClicked = {
                navigator.navigateToGetStarted()
            }
        )
    }
}