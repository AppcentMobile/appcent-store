package mobi.appcent.store.utils.extension

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import mobi.appcent.store.utils.util.Event

/**
 * Created by erenalpaslan on 27.12.2022
 */
fun <T> LiveData<Event<T>>.observeEvent(owner: LifecycleOwner, observe: (T?) -> Unit) {
    this.observe(owner, Observer {
        it.getContentIfNotHandled()?.let(observe)
    })
}

fun <T> MutableLiveData<Event<T>>.postEvent(value: T) {
    this.postValue(Event(value))
}