package mobi.appcent.store.common.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import mobi.appcent.store.utils.Event
import org.koin.core.component.KoinComponent

/**
 * Created by erenalpaslan on 11.08.2022
 */
open class BaseViewModel: ViewModel(), KoinComponent {

    protected val _error: MutableLiveData<Event<String?>> = MutableLiveData()
    val error: LiveData<Event<String?>> = _error

    private val _showProgress: MutableLiveData<Boolean> = MutableLiveData()
    val showProgress: LiveData<Boolean> = _showProgress

    fun showProgress() {
        _showProgress.postValue(true)
    }

    fun hideProgress() {
        _showProgress.postValue(false)
    }

    fun removeError() {
        //_error.postValue(null)
    }

}