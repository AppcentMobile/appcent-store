package mobi.appcent.store.ui.screen.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import mobi.appcent.store.common.base.BaseViewModel
import mobi.appcent.store.core.navigation.AppNavigator
import mobi.appcent.store.domain.usecases.LoginUseCase
import mobi.appcent.store.utils.extension.postEvent
import mobi.appcent.store.utils.AppResult
import mobi.appcent.store.utils.Event

/**
 * Created by erenalpaslan on 30.05.2023
 */
class LoginViewModel(
    private val loginUseCase: LoginUseCase
): BaseViewModel() {

    private val _uiState: MutableStateFlow<LoginUiState> = MutableStateFlow(LoginUiState())

    private val _onLoginSuccess: MutableLiveData<Event<Boolean>> = MutableLiveData()
    val onLoginSuccess: LiveData<Event<Boolean>> = _onLoginSuccess

    fun onLoginClicked() {
        viewModelScope.launch {
            showProgress()
            loginUseCase.execute(LoginUseCase.Params(
                email = _uiState.value.email,
                password = _uiState.value.password
            )).collect { result ->
                when(result) {
                    is AppResult.Error -> _error.postEvent(result.message)
                    is AppResult.Success -> _onLoginSuccess.postEvent(true)
                }
            }
            hideProgress()
        }
    }

    fun onEmailChanged(email: String?) {
        _uiState.update {
            it.copy(email = email)
        }
    }

    fun onPasswordChanged(password: String?) {
        _uiState.update {
            it.copy(password = password)
        }
    }

}