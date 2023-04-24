package mobi.appcent.store.ui.screen.splash

import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

/**
 * Created by erenalpaslan on 21.04.2023
 */
val splashModule = module {
    viewModelOf(::SplashViewModel)
}