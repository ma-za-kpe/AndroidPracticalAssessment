package com.maku.amalitechmakumazakpeassessment.ui.screen

import androidx.compose.animation.animateColor
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.maku.amalitechmakumazakpeassessment.ui.theme.AmalitechMakuMazakpeAssessmentTheme

@Composable
fun Tenth() {
    AnimationsInCompose()
}

@Composable
fun AnimationsInCompose(
    modifier: Modifier = Modifier
) {
    var sizestate by remember {
        mutableStateOf(200.dp)
    }
    val size by animateDpAsState(
        targetValue = sizestate,
        animationSpec = tween(
            durationMillis = 3000,
            delayMillis = 300,
            easing = LinearOutSlowInEasing
        )
    )

    var infiniteTransition = rememberInfiniteTransition()
    val color by infiniteTransition.animateColor(
        initialValue = Color.Red,
        targetValue = Color.Cyan,
        animationSpec = infiniteRepeatable(
            animation = tween(1000),
            repeatMode = RepeatMode.Restart
        )
    )
    val scale by infiniteTransition.animateFloat(
        initialValue = 3f,
        targetValue = 6f,
        animationSpec = infiniteRepeatable(
            // Infinitely repeating a 1000ms tween animation using default easing curve.
            animation = tween(1000),
            // After each iteration of the animation (i.e. every 1000ms), the animation will
            // start again from the [initialValue] defined above.
            // This is the default [RepeatMode]. See [RepeatMode.Reverse] below for an
            // alternative.
            repeatMode = RepeatMode.Restart
        )
    )

    Box(
        modifier = modifier
            .size(size)
            .border(
                border = BorderStroke(4.dp, color)
            ),
        contentAlignment = Alignment.BottomCenter
    ) {
        Icon(
            Icons.Filled.Favorite,
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.Center)
                .graphicsLayer(
                    scaleX = scale,
                    scaleY = scale
                ),
            tint = color
        )
        Button(onClick = {
            sizestate += 50.dp
        }) {
            Text(
                text = "Increase size"
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TenthPreview() {
    AmalitechMakuMazakpeAssessmentTheme {
        Tenth()
    }
}
