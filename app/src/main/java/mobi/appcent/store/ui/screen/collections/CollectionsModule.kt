package mobi.appcent.store.ui.screen.collections

import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

/**
 * Created by erenalpaslan on 21.04.2023
 */
val collectionsModule = module {
    viewModelOf(::CollectionsViewModel)
}
