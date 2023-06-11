package mobi.appcent.store.domain.usecases

import android.util.Log
import com.easylife.noty.utils.dispatchers.AppDispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import mobi.appcent.medusa.store.model.response.ProductCollection
import mobi.appcent.medusa.store.model.response.StoreCollectionsListRes
import mobi.appcent.store.common.base.BaseUseCase
import mobi.appcent.store.domain.repository.ProductRepository
import mobi.appcent.store.utils.AppResult

/**
 * Created by erenalpaslan on 1.06.2023
 */
class GetCollectionsUseCase(
    private val productRepository: ProductRepository,
    private val dispatchers: AppDispatchers
): BaseUseCase<MutableList<ProductCollection>, Unit>() {

    override suspend fun execute(params: Unit): Flow<AppResult<MutableList<ProductCollection>?>> = flow {
        try {
            val response = productRepository.getCollections()
            emit(AppResult.Success(response.data.collections))
        }catch (e: Exception) {
            emit(AppResult.Error(e.message))
        }
    }.flowOn(dispatchers.io)

}