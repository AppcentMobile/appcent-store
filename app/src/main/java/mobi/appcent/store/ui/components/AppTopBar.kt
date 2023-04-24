package mobi.appcent.store.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable

@Composable
fun AppTopBar(
    title: @Composable () -> Unit = {},
    actions: @Composable RowScope.() -> Unit = {},
    navigationIcon: @Composable () -> Unit = {},
    divider: @Composable () -> Unit = {}
) {
    Column {
        TopAppBar(
            title = {
                title()
            },
            actions = {
                actions()
            },
            navigationIcon = {
                navigationIcon()
            }
        )
        divider()
    }
}