package com.maku.amalitechmakumazakpeassessment.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.maku.amalitechmakumazakpeassessment.ui.theme.AmalitechMakuMazakpeAssessmentTheme

@Composable
fun LazyGridScreen() {
    LazyVerticalGrid(
        columns = GridCells.Adaptive(100.dp),
    ) {
        items(100) { index ->
            Box(
                modifier = Modifier
                    .padding(8.dp)
                    .aspectRatio(1f)
                    .clip(RoundedCornerShape(5.dp))
                    .background(Color.Magenta),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "item $index"
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LazyGridScreenPreview() {
    AmalitechMakuMazakpeAssessmentTheme {
        LazyGridScreen()
    }
}
