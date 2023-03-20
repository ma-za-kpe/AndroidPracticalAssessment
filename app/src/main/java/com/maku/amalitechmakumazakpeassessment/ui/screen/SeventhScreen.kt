package com.maku.amalitechmakumazakpeassessment.ui.screen

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.maku.amalitechmakumazakpeassessment.ui.theme.AmalitechMakuMazakpeAssessmentTheme

@Composable
fun Seventh() {
    ListsInCompose()
}


@Composable
fun ListsInCompose(
    modifier: Modifier = Modifier
) {
    LazyColumn(
        modifier = modifier.fillMaxSize(),
        contentPadding = PaddingValues(12.dp),
        reverseLayout = true
    ) {
        itemsIndexed(
            listOf(1, 2, 3, 4, 5)
        ) { index, it ->
            Text(
                text = "Number $it",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Right,
                modifier = modifier
                    .fillMaxSize()
                    .padding(6.dp)
            )
        }
        items(20) {
            Text(
                text = "No $it",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Right,
                modifier = modifier
                    .fillMaxSize()
                    .padding(6.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SeventhPreview() {
    AmalitechMakuMazakpeAssessmentTheme {
        Seventh()
    }
}
