package mobi.appcent.store.ui.screen.login

import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

/**
 * Created by erenalpaslan on 30.05.2023
 */
val loginModule = module {
    viewModelOf(::LoginViewModel)
}