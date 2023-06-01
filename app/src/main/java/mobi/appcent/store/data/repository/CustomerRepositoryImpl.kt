package mobi.appcent.store.data.repository

import com.easylife.noty.utils.dispatchers.AppDispatchers
import kotlinx.coroutines.withContext
import mobi.appcent.medusa.store.ApiResponse
import mobi.appcent.medusa.store.MedusaApi
import mobi.appcent.medusa.store.model.response.StoreAuthRes
import mobi.appcent.medusa.store.model.response.StoreCustomersRes
import mobi.appcent.medusa.store.model.response.StorePostCustomersReq
import mobi.appcent.store.domain.repository.CustomerRepository

/**
 * Created by erenalpaslan on 31.05.2023
 */
class CustomerRepositoryImpl(
    private val medusaApi: MedusaApi
): CustomerRepository {

    override suspend fun register(
        name: String?,
        surname: String?,
        email: String?,
        password: String?,
        phone: String?
    ): ApiResponse<StoreCustomersRes>? {
        val response = medusaApi.customers().createCustomer()
            .body(StorePostCustomersReq()
                .firstName(name)
                .lastName(surname)
                .email(email)
                .password(password)
                .phone(phone)
            ).execute()
        return response
    }

    override suspend fun login(email: String?, password: String?): ApiResponse<StoreAuthRes>? {
        return medusaApi.auth().postAuth()
            .email(email)
            .password(password)
            .execute()
    }

}