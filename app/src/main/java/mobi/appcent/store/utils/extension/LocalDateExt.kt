package mobi.appcent.store.utils.extension

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.LocalDate

/**
 * Created by erenalpaslan on 17.01.2023
 */

@RequiresApi(Build.VERSION_CODES.O)
fun LocalDate.isCurrentDate(currentDate: LocalDate): Boolean {
    return this.month.name == currentDate.month.name &&
        this.year == currentDate.year
}