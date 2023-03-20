package com.maku.amalitechmakumazakpeassessment.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.maku.amalitechmakumazakpeassessment.ui.theme.AmalitechMakuMazakpeAssessmentTheme

@Composable
fun Second() {
    Column(
        modifier = Modifier
            .background(Color.Cyan)
            .fillMaxHeight(0.7f)
            .fillMaxWidth()
            .padding(4.dp)
            .border(
                width = 4.dp,
                color = Color.Green
            )
            .padding(4.dp)
            .border(
                width = 4.dp,
                color = Color.Red
            )
            .padding(4.dp)
            .border(
                width = 4.dp,
                color = Color.Green
            )
            .padding(4.dp)
            .border(
                width = 4.dp,
                color = Color.Red
            )
            .padding(4.dp)
    ) {
        Text(
            text = "Maku...",
            modifier = Modifier
                .padding(4.dp)
                .offset(
                    50.dp,
                    20.dp
                )
                .border(
                    width = 4.dp,
                    color = Color.Red
                )
                .padding(4.dp)
        )
        Spacer(
            modifier = Modifier
                .height(50.dp)
                .clickable {
//                    Toast
//                        .makeText(
//                            this@MainActivity,
//                            "Maku ...",
//                            Toast.LENGTH_SHORT
//                        )
//                        .show()
                }
        )
        Text(text = "Maku...")
        Text(text = "Maku...")
    }
}

@Preview(showBackground = true)
@Composable
fun SecondPreview() {
    AmalitechMakuMazakpeAssessmentTheme {
        Second()
    }
}
