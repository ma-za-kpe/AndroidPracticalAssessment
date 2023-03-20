package com.maku.amalitechmakumazakpeassessment.ui.screen

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.TransformOrigin
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.maku.amalitechmakumazakpeassessment.R
import com.maku.amalitechmakumazakpeassessment.ui.theme.AmalitechMakuMazakpeAssessmentTheme

@Composable
fun DropDown() {
    Surface(
        color = Color(0xFF101010),
        modifier = Modifier
            .fillMaxSize()
    ) {
        AnimatedDropDown(
            modifier = Modifier
                .padding(15.dp),
            "Hello Maku"
        ) {
            Text(
                text = "Awesome animation revealed!",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .background(Color.Magenta),
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )
        }
    }
}


@Composable
fun AnimatedDropDown(
    modifier: Modifier = Modifier,
    textString: String = "Hello",
    iniatiallyOpened: Boolean = false,
    content: @Composable () -> Unit
) {
    var isOpen by remember {
        mutableStateOf(iniatiallyOpened)
    }

    val alpha = animateFloatAsState(
        targetValue = if (isOpen) {
            1f
        } else {
            0f
        },
        animationSpec = tween(
            durationMillis = 300
        )
    )

    val rotateX = animateFloatAsState(
        targetValue = if (isOpen) {
            0f
        } else {
            -90f
        },
        animationSpec = tween(
            durationMillis = 300
        )
    )

    Column(
        modifier = modifier
            .fillMaxWidth()
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = modifier
                .fillMaxWidth()
        ) {
            Text(
                text = textString,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White
            )

            Icon(
                imageVector = if (isOpen) {
                    Icons.Filled.KeyboardArrowUp
                } else {
                    Icons.Filled.ArrowDropDown
                },
                contentDescription = "open / close dropdown",
                tint = Color.White,
                modifier = modifier
                    .clickable {
                        isOpen = !isOpen
                    }
                    .scale(
                        1f,
                        if (isOpen) {
                            -1f
                        } else {
                            1f
                        }
                    )
            )
        }

        Spacer(
            modifier = modifier
                .height(10.dp)
        )

        Box(
            modifier = modifier
                .fillMaxWidth()
                .graphicsLayer {
                    transformOrigin = TransformOrigin(
                        0.5f,
                        0f
                    )
                    rotationX = rotateX.value
                }
                .alpha(
                    alpha.value
                )
        ) {
            content()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AnimatedDropDownUiPreview() {
    AmalitechMakuMazakpeAssessmentTheme {
        AnimatedDropDown(
            content = {}
        )
    }
}
