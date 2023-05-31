package mobi.appcent.store.ui.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

/**
 * Created by erenalpaslan on 31.05.2023
 */
@Composable
fun AppTextField(
    modifier: Modifier = Modifier,
    onValueChanged: (String?) -> Unit,
    placeholder: @Composable () -> Unit = {},
    singleLine: Boolean = false,
    isError: Boolean = false
) {
    var text by remember {
        mutableStateOf("")
    }

    TextField(
        modifier = Modifier.fillMaxWidth()
            .border(1.dp, MaterialTheme.colorScheme.onBackground, MaterialTheme.shapes.medium)
            .then(modifier),
        value = text,
        onValueChange = {
            text = it
            onValueChanged(it)
        },
        singleLine = singleLine,
        shape = TextFieldDefaults.outlinedShape,
        isError = isError,
        colors = TextFieldDefaults.textFieldColors(
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            containerColor = Color.Transparent,
        ),
        placeholder = placeholder
    )
}