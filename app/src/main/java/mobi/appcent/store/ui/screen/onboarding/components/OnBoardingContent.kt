package mobi.appcent.store.ui.screen.onboarding.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.google.accompanist.pager.HorizontalPagerIndicator
import kotlinx.coroutines.launch
import mobi.appcent.store.R
import mobi.appcent.store.core.navigation.AppNavigator
import mobi.appcent.store.ui.screen.home.navigateToHome
import mobi.appcent.store.ui.screen.onboarding.OnBoardingViewModel
import mobi.appcent.store.ui.theme.white

/**
 * Created by erenalpaslan on 2.05.2023
 */
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun OnBoardingContent(
    viewModel: OnBoardingViewModel
) {
    val pagerState = rememberPagerState()
    var lastPage by remember {
        mutableStateOf(false)
    }
    val coroutineScope = rememberCoroutineScope()

    LaunchedEffect(key1 = pagerState.currentPage) {
        lastPage = pagerState.currentPage == 2
    }

    Scaffold { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            HorizontalPager(
                pageCount = 3,
                state = pagerState,
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
            ) { page ->
                when (page) {
                    0 -> OnBoardingPagerItem(
                        title = stringResource(id = R.string.onboarding_title_1),
                        description = stringResource(id = R.string.onboarding_desc_1),
                        painter = painterResource(id = R.drawable.onboarding_1)
                    )

                    1 -> OnBoardingPagerItem(
                        title = stringResource(id = R.string.onboarding_title_2),
                        description = stringResource(id = R.string.onboarding_desc_2),
                        painter = painterResource(id = R.drawable.onboarding_2)
                    )

                    2 -> OnBoardingPagerItem(
                        title = stringResource(id = R.string.onboarding_title_3),
                        description = stringResource(id = R.string.onboarding_desc_3),
                        painter = painterResource(id = R.drawable.onboarding_3)
                    )
                }
            }
            HorizontalPagerIndicator(
                pagerState = pagerState,
                pageCount = 3,
            )
            Spacer(modifier = Modifier.height(32.dp))
            Button(
                onClick = {
                    if (!lastPage)
                        coroutineScope.launch {
                            pagerState.animateScrollToPage(pagerState.currentPage + 1)
                        }
                    else
                        viewModel.onGetStartedClicked()
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            ) {
                if (!lastPage)
                    Text(text = stringResource(id = R.string.btn_next), color = white)
                else
                    Text(text = stringResource(id = R.string.btn_get_started), color = white)
            }
            TextButton(
                onClick = {
                    viewModel.onGetStartedClicked()
                },
                modifier = Modifier.alpha(if (lastPage) 0f else 1f),
                enabled = !lastPage
            ) {
                Text(text = stringResource(id = R.string.btn_skip), color = white)
            }
        }
    }
}