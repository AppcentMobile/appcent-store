package mobi.appcent.store.di

import com.easylife.noty.utils.dispatchers.dispatcherModule
import mobi.appcent.core.preferences.di.preferencesModule
import mobi.appcent.medusa.store.MedusaApi
import mobi.appcent.store.core.navigation.navigationModule
import mobi.appcent.store.data.repository.repositoryModule
import mobi.appcent.store.domain.usecases.useCaseModule
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
import org.koin.dsl.module

/**
 * Created by erenalpaslan on 31.05.2023
 */
val appModule = module {
    includes(
        medusaModule,
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
        signUpModule,
        repositoryModule,
        dispatcherModule,
        useCaseModule
    )
}