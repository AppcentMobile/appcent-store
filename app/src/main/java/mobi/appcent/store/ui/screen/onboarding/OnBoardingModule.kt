package mobi.appcent.store.ui.screen.onboarding

import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

/**
 * Created by erenalpaslan on 2.05.2023
 */
val onBoardingModule = module {
    viewModelOf(::OnBoardingViewModel)
}