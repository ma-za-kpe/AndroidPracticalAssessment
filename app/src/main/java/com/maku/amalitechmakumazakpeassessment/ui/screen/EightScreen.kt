package com.maku.amalitechmakumazakpeassessment.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import androidx.constraintlayout.compose.Dimension
import com.maku.amalitechmakumazakpeassessment.ui.theme.AmalitechMakuMazakpeAssessmentTheme

@Composable
fun Eight() {
    ConstraintLayoutInCompose()
}

@Composable
fun ConstraintLayoutInCompose(
    modifier: Modifier = Modifier
) {
    val set = ConstraintSet {
        val greenBox = createRefFor("greenBox")
        val redBox = createRefFor("redBox")

        constrain(
            greenBox
        ) {
            top.linkTo(parent.top)
            start.linkTo(parent.start)
            width = Dimension.fillToConstraints
        }

        constrain(
            redBox
        ) {
            top.linkTo(greenBox.bottom)
            start.linkTo(parent.start)
            width = Dimension.fillToConstraints
        }
    }

    ConstraintLayout(
        constraintSet = set,
        modifier = modifier.fillMaxSize()
    ) {
        Box(
            modifier = modifier
                .background(Color.Green)
                .layoutId("greenBox")
        )

        Box(
            modifier = modifier
                .background(Color.Green)
                .layoutId("redBox")
        )
    }
}

@Preview(showBackground = true)
@Composable
fun EightPreview() {
    AmalitechMakuMazakpeAssessmentTheme {
        Eight()
    }
}
