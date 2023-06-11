package mobi.appcent.store.domain.usecases

import org.koin.core.module.dsl.factoryOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

/**
 * Created by erenalpaslan on 1.06.2023
 */
val useCaseModule = module {
    factoryOf(::RegisterUseCase)
    factoryOf(::LoginUseCase)
    factoryOf(::GetCollectionsUseCase)
}