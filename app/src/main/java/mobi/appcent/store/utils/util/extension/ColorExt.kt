package com.easylife.noty.core.common.util.extension

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb

/**
 * Created by erenalpaslan on 18.03.2023
 */
fun String?.toColor(defaultColor: Color): Color {
    return try {
        Color(android.graphics.Color.parseColor(this))
    }catch (e: Exception) {
        defaultColor
    }
}

fun Color.toHexString(): String {
    return java.lang.String.format("#%06X", 0xFFFFFF and this.toArgb())
}