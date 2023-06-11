package mobi.appcent.store.ui.screen.home

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import mobi.appcent.store.common.base.BaseScreen
import mobi.appcent.store.ui.screen.home.components.HomeContent

/**
 * Created by erenalpaslan on 21.04.2023
 */
class HomeScreen: BaseScreen<HomeViewModel>() {
    
    @Composable
    override fun Screen() {
        val uiState by viewModel.uiState.collectAsState()
        val collectionUiState by viewModel.collectionUiState.collectAsState()

        HomeContent(
            uiState = uiState,
            collectionUiState = collectionUiState,
            viewModel = viewModel
        )
    }
    
}