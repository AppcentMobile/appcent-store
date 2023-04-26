package mobi.appcent.store.ui.screen.productdetail

import androidx.compose.runtime.Composable
import mobi.appcent.store.common.base.BaseScreen
import mobi.appcent.store.ui.screen.productdetail.components.ProductDetailContent

/**
 * Created by erenalpaslan on 26.04.2023
 */
class ProductDetailScreen: BaseScreen<ProductDetailViewModel>() {
    @Composable
    override fun Screen() {

        ProductDetailContent()
    }
}