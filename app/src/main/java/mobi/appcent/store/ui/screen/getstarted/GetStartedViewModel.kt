package mobi.appcent.store.ui.screen.getstarted

import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import mobi.appcent.core.preferences.PreferencesKeys
import mobi.appcent.core.preferences.PreferencesManager
import mobi.appcent.store.common.base.BaseViewModel
import mobi.appcent.store.core.navigation.AppNavigator

/**
 * Created by erenalpaslan on 30.05.2023
 */
class GetStartedViewModel(
    private val navigator: AppNavigator,
    private val preferencesManager: PreferencesManager
): BaseViewModel() {


    init {
        viewModelScope.launch {
            preferencesManager.setBoolean(PreferencesKeys.IS_FIRST_ENTER, false)
        }
    }

}