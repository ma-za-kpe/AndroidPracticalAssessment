package com.maku.amalitechmakumazakpeassessment.ui.screen

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.maku.amalitechmakumazakpeassessment.ui.theme.AmalitechMakuMazakpeAssessmentTheme
import com.maku.amalitechmakumazakpeassessment.ui.theme.spacing

@Composable
fun ThemeScreen() {
    Surface(
        color = MaterialTheme.colors.background,
        modifier = Modifier
            .padding(
                MaterialTheme.spacing.extraLarge
            )
    ) {
        Text(
            text = "Customising your material theme",
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ThemeScreenPreview() {
    AmalitechMakuMazakpeAssessmentTheme {
        ThemeScreen()
    }
}
