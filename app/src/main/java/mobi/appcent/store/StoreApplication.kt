package mobi.appcent.store

import android.app.Application
import mobi.appcent.store.core.navigation.navigationModule
import mobi.appcent.store.ui.screen.cart.cartModule
import mobi.appcent.store.ui.screen.favorites.catalogModule
import mobi.appcent.store.ui.screen.home.homeModule
import mobi.appcent.store.ui.screen.profile.profileModule
import mobi.appcent.store.ui.screen.splash.splashModule
import org.koin.core.context.startKoin

/**
 * Created by erenalpaslan on 20.04.2023
 */
class StoreApplication: Application() {

    private val moduleList = listOf(
        navigationModule,
        splashModule,
        homeModule,
        catalogModule,
        cartModule,
        profileModule
    )

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(moduleList)
        }
    }

}