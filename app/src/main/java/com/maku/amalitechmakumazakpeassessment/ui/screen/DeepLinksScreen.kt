package com.maku.amalitechmakumazakpeassessment.ui.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.maku.amalitechmakumazakpeassessment.ui.theme.AmalitechMakuMazakpeAssessmentTheme

@Composable
fun DeepLinksScreen(id: Int?) {
    // testing this using the android studio tools app links assistant:: https://maku.dev/78
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "The id is $id"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DeepLinksScreenPreview() {
    AmalitechMakuMazakpeAssessmentTheme {
        DeepLinksScreen(0)
    }
}
