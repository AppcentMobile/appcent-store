package mobi.appcent.store.utils.util

/**
 * Created by erenalpaslan on 25.03.2023
 */
object FormatUtil {
    fun formatDuration(duration: Int): String {
        val seconds = duration / 1_000
        val minutes = seconds / 60
        val remainingSeconds = seconds % 60
        return String.format("%02d:%02d", minutes, remainingSeconds)
    }
}