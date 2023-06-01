package mobi.appcent.store.data.model.register

/**
 * Created by erenalpaslan on 31.05.2023
 */
data class RegisterRequest(
    val name: String?,
    val surname: String?,
    val email: String?,
    val password: String?,
    val phone: String?
)
