package com.maku.amalitechmakumazakpeassessment.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.maku.amalitechmakumazakpeassessment.ui.theme.AmalitechMakuMazakpeAssessmentTheme
import kotlinx.coroutines.launch

@Composable
fun Sixth() {
    TextFieldsInCompose()
}

@Composable
fun TextFieldsInCompose(
    modifier: Modifier = Modifier
) {
    val state = rememberScaffoldState()
    val coroutineScope = rememberCoroutineScope()
    var textFieldState by remember {
        mutableStateOf("")
    }
    Scaffold(
        modifier = modifier.fillMaxSize(),
        scaffoldState = state
    ) { it ->
        Column(
            modifier = modifier.padding(it),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            TextField(
                value = textFieldState,
                modifier = modifier
                    .fillMaxWidth()
                    .padding(8.dp),
                onValueChange = {
                    textFieldState = it
                },
                label = {
                    Text(text = "Name")
                }
            )
        }

        Spacer(
            modifier = modifier.padding(16.dp)
        )

        Button(onClick = {
            coroutineScope.launch {
                state.snackbarHostState.showSnackbar(
                    "clicking $textFieldState"
                )
            }
        }) {
            Text(
                text = "Click Me"
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SixthPreview() {
    AmalitechMakuMazakpeAssessmentTheme {
        Sixth()
    }
}
