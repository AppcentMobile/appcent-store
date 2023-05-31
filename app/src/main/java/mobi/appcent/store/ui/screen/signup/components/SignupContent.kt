package mobi.appcent.store.ui.screen.signup.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.unit.dp
import mobi.appcent.store.ui.components.AppTextField

/**
 * Created by erenalpaslan on 31.05.2023
 */
@Composable
fun SignupContent(
    onSignupClicked: () -> Unit,
    onLoginClicked: () -> Unit
) {
    Scaffold {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
                .padding(16.dp)
        ) {
            Text(text = "Hi!", style = MaterialTheme.typography.headlineLarge)
            Text(text = "Create a new account")
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
                        Text(text = "Firstname")
                    },
                    singleLine = true
                )
                Spacer(modifier = Modifier.height(16.dp))
                AppTextField(
                    onValueChanged = {},
                    placeholder = {
                        Text(text = "Lastname")
                    },
                    singleLine = true
                )
                Spacer(modifier = Modifier.height(16.dp))
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
                Spacer(modifier = Modifier.height(16.dp))
                AppTextField(
                    onValueChanged = {},
                    placeholder = {
                        Text(text = "Phone")
                    },
                    singleLine = true
                )
                Spacer(modifier = Modifier.height(16.dp))
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Button(
                    onClick = onSignupClicked,
                    shape = MaterialTheme.shapes.medium,
                    modifier = Modifier.fillMaxWidth(),
                ) {
                    Text(text = "Signup")
                }
            }
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Text(text = buildAnnotatedString {
                        append("Already have an account?")
                        pushStyle(SpanStyle(color = MaterialTheme.colorScheme.primary))
                        append(" Sign in")
                    },
                    modifier = Modifier.clickable {
                        onLoginClicked()
                    }
                )
            }
        }
    }
}