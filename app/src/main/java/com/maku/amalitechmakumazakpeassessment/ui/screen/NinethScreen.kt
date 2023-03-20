package com.maku.amalitechmakumazakpeassessment.ui.screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.maku.amalitechmakumazakpeassessment.ui.theme.AmalitechMakuMazakpeAssessmentTheme
import kotlinx.coroutines.delay

@Composable
fun Nineth() {
    EffectHandlersInCompose()
}

@Composable
fun EffectHandlersInCompose(
    modifier: Modifier = Modifier
) {
    var text by remember {
        mutableStateOf("")
    }
//        Button(
//            onClick = {
//                text += "#"
//            }
//        ) {
//            i++
//            Text(text = text)
//        }

    LaunchedEffect(
        key1 = text
    ) {
        delay(1000L)
    }
}

@Preview(showBackground = true)
@Composable
fun NinethPreview() {
    AmalitechMakuMazakpeAssessmentTheme {
        Nineth()
    }
}
