plugins {
    id("store.android.library")
    id("store.koin")
    id("store.android.library.compose")
}
android {
    namespace = "mobi.appcent.core.preferences"
}
dependencies {
    api(libs.data.store)
}