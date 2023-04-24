package mobi.appcent.store.utils.extension


/**
 * Created by erenalpaslan on 4.09.2022
 */
fun String.removeNonAlphaNumeric(): String? {
    return this.replace("[^a-zA-Z0-9]".toRegex(), "")
}