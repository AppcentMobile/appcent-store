package mobi.appcent.store.ui.screen.signup

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import mobi.appcent.store.common.base.BaseViewModel
import mobi.appcent.store.domain.usecases.RegisterUseCase
import mobi.appcent.store.utils.extension.postEvent
import mobi.appcent.store.utils.AppResult
import mobi.appcent.store.utils.Event

/**
 * Created by erenalpaslan on 30.05.2023
 */
class SignupViewModel(
    private val registerUseCase: RegisterUseCase
): BaseViewModel() {

    private val _uiState: MutableStateFlow<SignupUiState> = MutableStateFlow(SignupUiState())

    private val _onRegisterSuccess: MutableLiveData<Event<Boolean>> = MutableLiveData()
    val onRegisterSuccess: LiveData<Event<Boolean>> = _onRegisterSuccess

    fun onRegisterClicked() {
        viewModelScope.launch {
            showProgress()
            registerUseCase.execute(RegisterUseCase.Param(
                name = _uiState.value.name,
                surname = _uiState.value.surname,
                email = _uiState.value.email,
                password = _uiState.value.password,
                phone = _uiState.value.phone
            )).collect {result ->
                when(result) {
                    is AppResult.Error -> _error.postValue(result.message)
                    is AppResult.Success -> _onRegisterSuccess.postEvent(true)
                }
            }
            hideProgress()
        }
    }

    fun onNameChanged(name: String?) {
        _uiState.update {
            it.copy(name = name)
        }
    }

    fun onSurnameChanged(surname: String?) {
        _uiState.update {
            it.copy(surname = surname)
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

    fun onPhoneChanged(phone: String?) {
        _uiState.update {
            it.copy(phone = phone)
        }
    }
}