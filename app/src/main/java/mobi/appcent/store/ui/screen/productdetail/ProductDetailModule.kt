package mobi.appcent.store.ui.screen.productdetail

import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

/**
 * Created by erenalpaslan on 26.04.2023
 */
val productDetailModule = module {
    viewModelOf(::ProductDetailViewModel)
}