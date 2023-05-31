package mobi.appcent.store.ui.screen.login.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.unit.dp
import mobi.appcent.store.ui.components.AppTextField

/**
 * Created by erenalpaslan on 30.05.2023
 */
@Composable
fun LoginContent(
    onLoginClicked: () -> Unit,
    onForgotPasswordClicked: () -> Unit,
    onSignupClicked: () -> Unit
) {
    Scaffold {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
                .padding(16.dp)
        ) {
            Text(text = "Welcome!", style = MaterialTheme.typography.headlineLarge)
            Text(text = "Sign in to continue")
            Spacer(modifier = Modifier.height(16.dp))
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                AppTextField(
                    onValueChanged = {},
                    placeholder = {
                        Text(text = "Email")
                    },
                    singleLine = true
                )
                Spacer(modifier = Modifier.height(16.dp))
                AppTextField(
                    onValueChanged = {},
                    placeholder = {
                        Text(text = "Password")
                    },
                    singleLine = true
                )
            }
            Column(
                modifier = Modifier.fillMaxSize().weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Button(
                    onClick = onLoginClicked,
                    shape = MaterialTheme.shapes.medium,
                    modifier = Modifier.fillMaxWidth(),
                ) {
                    Text(text = "Login")
                }
                TextButton(onClick = onForgotPasswordClicked) {
                    Text(text = "Forgot Password?")
                }
            }
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Text(text = buildAnnotatedString {
                    append("Don't have an account")
                    pushStyle(SpanStyle(color = MaterialTheme.colorScheme.primary))
                    append(" Signup")
                },
                    modifier = Modifier.clickable {
                        onSignupClicked()
                    }
                )
            }
        }
    }
}