package mobi.appcent.store.ui.screen.getstarted

import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

/**
 * Created by erenalpaslan on 30.05.2023
 */
val getStartedModule = module {
    viewModelOf(::GetStartedViewModel)
}