package mobi.appcent.store.data.repository

import mobi.appcent.medusa.store.ApiResponse
import mobi.appcent.medusa.store.MedusaApi
import mobi.appcent.medusa.store.model.response.StoreCollectionsListRes
import mobi.appcent.store.domain.repository.ProductRepository

/**
 * Created by erenalpaslan on 1.06.2023
 */
class ProductRepositoryImpl(
    private val medusaApi: MedusaApi
): ProductRepository {

    override suspend fun getCollections(): ApiResponse<StoreCollectionsListRes> {
        return medusaApi.collections().collections
            .execute()
    }

}