package mobi.appcent.store.common.base

import kotlinx.coroutines.flow.Flow
import mobi.appcent.store.utils.AppResult

/**
 * Created by erenalpaslan on 19.02.2023
 */
abstract class BaseUseCase<T, R>() {
    abstract suspend fun execute(params: R): Flow<AppResult<T?>>
}