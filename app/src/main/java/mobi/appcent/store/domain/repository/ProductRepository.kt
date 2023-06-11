package mobi.appcent.store.domain.repository

import mobi.appcent.medusa.store.ApiResponse
import mobi.appcent.medusa.store.model.response.StoreCollectionsListRes

/**
 * Created by erenalpaslan on 1.06.2023
 */
interface ProductRepository {

    suspend fun getCollections(): ApiResponse<StoreCollectionsListRes>

}