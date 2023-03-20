package com.maku.amalitechmakumazakpeassessment.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.maku.amalitechmakumazakpeassessment.ui.theme.AmalitechMakuMazakpeAssessmentTheme
import com.maku.amalitechmakumazakpeassessment.ui.theme.ButtonBlue

@Composable
fun MainScreen(
    items: List<String>,
    onNavigateToScreen: (String) -> Unit
) {
    LazyColumn(
        contentPadding = PaddingValues(
            horizontal = 16.dp,
            vertical = 8.dp
        )
    ) {
        items(items) {
            ListItem(
                item = it,
                onNavigateToScreen = onNavigateToScreen
            )
        }
    }
}

@Composable
fun ListItem(
    item: String,
    onNavigateToScreen: (String) -> Unit
) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp)
    ) {

        val offset = Offset(
            5.0f,
            10.0f
        )
        Text(
            text = item,
            style = TextStyle(
                fontSize = 24.sp,
                shadow = Shadow(
                    color = Color.Blue,
                    offset = offset,
                    blurRadius = 3f
                )
            )
        )

        Box(
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .background(ButtonBlue)
                .padding(10.dp)
                .clickable {
                    onNavigateToScreen(item.replace(" ", ""))
                },
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = Icons.Outlined.ArrowForward,
                contentDescription = "Navigate",
                tint = Color.White,
                modifier = Modifier
                    .size(16.dp)
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun ListItemPreview() {
    AmalitechMakuMazakpeAssessmentTheme {
        ListItem(
            "Drop Down",
            {}
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    AmalitechMakuMazakpeAssessmentTheme {
        MainScreen(
            items = listOf(
                "India",
                "Pakistan",
                "China",
                "United States"
            ),
            {}
        )
    }
}
