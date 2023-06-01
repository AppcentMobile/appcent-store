package mobi.appcent.store.utils

/**
 * Created by erenalpaslan on 9.01.2023
 */
sealed interface AppResult<T> {

    data class Error<T>(val message: String?): AppResult<T?>

    data class Success<T>(val data: T?): AppResult<T?>
}
