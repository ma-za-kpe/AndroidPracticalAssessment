package com.maku.amalitechmakumazakpeassessment.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.maku.amalitechmakumazakpeassessment.ui.theme.AmalitechMakuMazakpeAssessmentTheme
import kotlin.random.Random

@Composable
fun Fifth() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        val color = remember {
            mutableStateOf(Color(0xFF3771E6))
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    Color(color.value.value)
                )
                .weight(1f)
                .clickable {
                    color.value = Color(
                        Random.nextFloat(),
                        Random.nextFloat(),
                        Random.nextFloat(),
                        1f
                    )
                }
        )

        StateInCompose(
            {},
            modifier = Modifier
                .weight(1f)
        )
    }
}

@Composable
fun StateInCompose(
    updateColor: (Color) -> Unit,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(
                Color.Magenta
            )
            .clickable {
                updateColor(
                    Color(
                        Random.nextFloat(),
                        Random.nextFloat(),
                        Random.nextFloat(),
                        1f
                    )
                )
            }
    )
}

@Preview(showBackground = true)
@Composable
fun StateInComposePreview() {
    AmalitechMakuMazakpeAssessmentTheme {
        StateInCompose({})
    }
}

@Preview(showBackground = true)
@Composable
fun FifthPreview() {
    AmalitechMakuMazakpeAssessmentTheme {
        Fifth()
    }
}
