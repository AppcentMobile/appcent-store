package mobi.appcent.store.data.repository

import mobi.appcent.store.domain.repository.CustomerRepository
import mobi.appcent.store.domain.repository.ProductRepository
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module

/**
 * Created by erenalpaslan on 31.05.2023
 */
val repositoryModule = module {
    factory<CustomerRepository> { CustomerRepositoryImpl(get()) }
    factory<ProductRepository> { ProductRepositoryImpl(get()) }
}