package mobi.appcent.store.ui.screen.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import mobi.appcent.store.R
import mobi.appcent.store.common.base.BaseScreen

/**
 * Created by erenalpaslan on 21.04.2023
 */
class SplashScreen: BaseScreen<SplashViewModel>() {

    @Composable
    override fun Screen() {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "",
                modifier = Modifier
                    .size(100.dp)
                    .clip(MaterialTheme.shapes.large)
            )
        }
    }

}