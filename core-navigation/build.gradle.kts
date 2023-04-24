plugins {
    id("store.android.library")
    id("store.koin")
    id("store.android.library.compose")
}
android {
    namespace = "mobi.appcent.store.core.navigation"
}
dependencies {
    implementation(libs.gson)
    implementation(libs.androidx.lifecycle.livedata)
    implementation(libs.navigation.compose)
}