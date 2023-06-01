package mobi.appcent.store.di

import mobi.appcent.medusa.store.MedusaApi
import org.koin.dsl.module

/**
 * Created by erenalpaslan on 31.05.2023
 */
val medusaModule = module {
    single {
        val medusaApi = MedusaApi()

        medusaApi.defaultApiClient
            .setVerifyingSsl(false)
            .setBasePath("https://api.ecommerce.appcent.dev/store")
            .setDebugging(true)
        medusaApi
    }
}