package mobi.appcent.store

import android.app.Application
import mobi.appcent.core.preferences.di.preferencesModule
import mobi.appcent.store.core.navigation.navigationModule
import mobi.appcent.store.ui.screen.cart.cartModule
import mobi.appcent.store.ui.screen.collections.collectionsModule
import mobi.appcent.store.ui.screen.getstarted.getStartedModule
import mobi.appcent.store.ui.screen.home.homeModule
import mobi.appcent.store.ui.screen.login.loginModule
import mobi.appcent.store.ui.screen.onboarding.onBoardingModule
import mobi.appcent.store.ui.screen.productdetail.productDetailModule
import mobi.appcent.store.ui.screen.profile.profileModule
import mobi.appcent.store.ui.screen.signup.signUpModule
import mobi.appcent.store.ui.screen.splash.splashModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

/**
 * Created by erenalpaslan on 20.04.2023
 */
class StoreApplication: Application() {

    private val moduleList = listOf(
        navigationModule,
        splashModule,
        homeModule,
        collectionsModule,
        cartModule,
        profileModule,
        productDetailModule,
        preferencesModule,
        onBoardingModule,
        getStartedModule,
        loginModule,
        signUpModule
    )

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@StoreApplication)
            modules(moduleList)
        }
    }

}