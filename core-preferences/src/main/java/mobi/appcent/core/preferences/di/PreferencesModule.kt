package mobi.appcent.core.preferences.di

import mobi.appcent.core.preferences.PreferencesManager
import org.koin.android.ext.koin.androidContext
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module


/**
 * Created by erenalpaslan on 23.12.2022
 */
val preferencesModule = module {
    single {
        PreferencesManager(androidContext())
    }
}