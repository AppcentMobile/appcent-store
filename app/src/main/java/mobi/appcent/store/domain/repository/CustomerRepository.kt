package mobi.appcent.store.domain.repository

import mobi.appcent.medusa.store.ApiResponse
import mobi.appcent.medusa.store.model.response.StoreAuthRes
import mobi.appcent.medusa.store.model.response.StoreCustomersRes
import mobi.appcent.store.data.model.register.RegisterRequest

/**
 * Created by erenalpaslan on 31.05.2023
 */
interface CustomerRepository {
    suspend fun register(
        name: String?,
        surname: String?,
        email: String?,
        password: String?,
        phone: String?
    ): ApiResponse<StoreCustomersRes>?

    suspend fun login(
        email: String?,
        password: String?
    ): ApiResponse<StoreAuthRes>?
}