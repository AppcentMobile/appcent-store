package mobi.appcent.store.domain.usecases

import com.easylife.noty.utils.dispatchers.AppDispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import mobi.appcent.medusa.store.model.response.Customer
import mobi.appcent.store.common.base.BaseUseCase
import mobi.appcent.store.domain.repository.CustomerRepository
import mobi.appcent.store.utils.AppResult

/**
 * Created by erenalpaslan on 1.06.2023
 */
class LoginUseCase(
    private val customerRepository: CustomerRepository,
    private val dispatchers: AppDispatchers
): BaseUseCase<Customer, LoginUseCase.Params>() {

    data class Params(
        val email: String?,
        val password: String?
    )

    override suspend fun execute(params: Params): Flow<AppResult<Customer?>> = flow {
        try {
            val response = customerRepository.login(
                params.email,
                params.password
            )
            emit(AppResult.Success(response?.data?.customer))
        }catch (e: Exception) {
            emit(AppResult.Error(e.message))
        }
    }.flowOn(dispatchers.io)


}