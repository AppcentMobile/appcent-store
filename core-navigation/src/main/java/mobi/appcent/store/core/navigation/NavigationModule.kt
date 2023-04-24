package mobi.appcent.store.core.navigation

import org.koin.dsl.module

/**
 * Created by erenalpaslan on 4.01.2023
 */
val navigationModule = module {
    single<AppNavigator> { ComposeNavigator() }
}