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
class RegisterUseCase(
    private val customerRepository: CustomerRepository,
    private val dispatchers: AppDispatchers
): BaseUseCase<Customer, RegisterUseCase.Param>() {

    data class Param(
        val name: String?,
        val surname: String?,
        val email: String?,
        val password: String?,
        val phone: String?
    )

    override suspend fun execute(params: Param): Flow<AppResult<Customer?>> = flow {
        try {
            val response = customerRepository.register(
                name = params.name,
                surname = params.surname,
                email = params.email,
                password = params.password,
                phone = params.phone
            )

            emit(AppResult.Success(response?.data?.customer))
        }catch (e: Exception) {
            emit(AppResult.Error(e.message))
        }
    }.flowOn(dispatchers.io)

}