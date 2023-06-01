package com.easylife.noty.utils.dispatchers

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.MainCoroutineDispatcher
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

/**
 * Created by erenalpaslan on 19.02.2023
 */
class AppDispatchers: IAppDispatchers {
    override val main: MainCoroutineDispatcher
        get() = Dispatchers.Main

    override val io: CoroutineDispatcher
        get() = Dispatchers.IO

    override val default: CoroutineDispatcher
        get() = Dispatchers.Default
}

val dispatcherModule = module {
    singleOf(::AppDispatchers)
}