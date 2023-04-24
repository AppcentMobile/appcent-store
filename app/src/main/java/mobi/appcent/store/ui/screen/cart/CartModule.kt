package mobi.appcent.store.ui.screen.cart

import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

/**
 * Created by erenalpaslan on 21.04.2023
 */
val cartModule = module {
    viewModelOf(::CartViewModel)
}