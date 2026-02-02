package com.stevens.software.smartstep.profile

import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.stevens.software.smartstep.R
import com.stevens.software.smartstep.ui.theme.extendedColours

@Composable
fun ProfileScreen() {
    ProfileView(
        onSkipProfileSetup = {}
    )
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
internal fun ProfileView(
    onSkipProfileSetup: () -> Unit
) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                colors = TopAppBarDefaults.topAppBarColors().copy(
                    containerColor = MaterialTheme.extendedColours.backgroundWhite
                ),
                title = {
                    Text(
                        text = stringResource(R.string.profile_title),
                        style = MaterialTheme.typography.titleMedium,
                        color = MaterialTheme.extendedColours.textPrimary
                    )
                },
                actions = {
                    TextButton(
                        onClick = onSkipProfileSetup
                    ) {
                        Text(
                            text = stringResource(R.string.profile_skip),
                            style = MaterialTheme.typography.bodyLarge,
                            color = MaterialTheme.extendedColours.buttonPrimary
                        )
                    }
                }
            )
        }
    ) { contentPadding ->
    }
}

@Preview
@Composable
private fun ProfilePreview() {
    MaterialTheme {
        ProfileScreen()
    }
}