package com.maku.amalitechmakumazakpeassessment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.maku.amalitechmakumazakpeassessment.ui.theme.AmalitechMakuMazakpeAssessmentTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AmalitechMakuMazakpeAssessmentTheme {
//                Greeting("Maku ...")
                // TODO 3: uncomment and move this using navigation button for first video to its own screen
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(6.dp)
                ) {
                    ImageCard(
                        painter = painterResource(
                            id = R.drawable.ic_launcher_background
                        ),
                        contentDescription = "Cool card with image",
                        title = "This is Maku"
                    )
                }
            }
        }
    }

    @Composable
    fun ImageCard(
        painter: Painter,
        contentDescription: String,
        title: String,
        modifier: Modifier = Modifier
    ) {
        // TODO 3: uncomment and move this using navigation button for first video to its own screen
        Card(
            modifier = modifier
                .width(200.dp),
            shape = RoundedCornerShape(15.dp),
            elevation = 5.dp
        ) {
            Box(
                modifier = modifier
                    .height(200.dp)
            ) {
                Image(
                    painter = painter,
                    contentDescription = contentDescription,
                    modifier = modifier
                        .fillMaxSize(),
                    contentScale = ContentScale.Fit
                )

                Box(
                    modifier = modifier
                        .fillMaxSize()
                        .background(
                            brush = Brush.verticalGradient(
                                colors = listOf(
                                    Color.Transparent,
                                    Color.Black
                                ),
                                startY = 300f
                            )
                        )
                ) {}

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(12.dp),
                    contentAlignment = Alignment.BottomStart
                ) {
                    Text(
                        text = title,
                        style = TextStyle(
                            color = Color.White,
                            fontSize = 16.sp
                        )
                    )
                }
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun ImageCardPreview() {
        AmalitechMakuMazakpeAssessmentTheme {
            ImageCard(
                painter = painterResource(
                    id = R.drawable.ic_launcher_background
                ),
                "Cool card with image",
                "This is Maku"
            )
        }
    }

    @Composable
    fun Greeting(name: String) {
        // TODO 2: uncomment and move this using navigation button for first video to its own screen
//        Column(
//            modifier = Modifier
//                .background(Color.Cyan)
//                .fillMaxHeight(0.7f)
//                .fillMaxWidth()
//                .padding(4.dp)
//                .border(
//                    width = 4.dp,
//                    color = Color.Green
//                )
//                .padding(4.dp)
//                .border(
//                    width = 4.dp,
//                    color = Color.Red
//                )
//                .padding(4.dp)
//                .border(
//                    width = 4.dp,
//                    color = Color.Green
//                )
//                .padding(4.dp)
//                .border(
//                    width = 4.dp,
//                    color = Color.Red
//                )
//                .padding(4.dp)
//        ) {
//            Text(
//                text = "Maku...",
//                modifier = Modifier
//                    .padding(4.dp)
//                    .offset(
//                        50.dp,
//                        20.dp
//                    )
//                    .border(
//                        width = 4.dp,
//                        color = Color.Red
//                    )
//                    .padding(4.dp)
//            )
//            Spacer(
//                modifier = Modifier
//                    .height(50.dp)
//                    .clickable {
//                        Toast
//                            .makeText(
//                                this@MainActivity,
//                                "Maku ...",
//                                Toast.LENGTH_SHORT
//                            )
//                            .show()
//                    }
//            )
//            Text(text = "Maku...")
//            Text(text = "Maku...")
//        }

        // TODO 1: uncomment and move this using navigation button for second video to its own screen
//                    Column(
//                        modifier = Modifier
//                            .fillMaxSize()
//                            .background(Color.Magenta),
//                        horizontalAlignment = Alignment.CenterHorizontally,
//                        verticalArrangement = Arrangement.Top
//                    ) {
//                        Text(text = "Maku...")
//                        Text(text = "Maku...")
//                        Text(text = "Maku...")
//                    }

//                    Row(
//                        modifier = Modifier
//                            .width(240.dp)
//                            .fillMaxHeight(0.6f)
//                            .background(Color.Magenta),
//                        horizontalArrangement = Arrangement.SpaceEvenly,
//                        verticalAlignment = Alignment.Bottom
//                    ) {
//                        Text(text = "Maku...")
//                        Text(text = "Maku...")
//                        Text(text = "Maku...")
//                    }
        // TODO 0: uncomment and move this using navigation button for first video to its own screen
        // Greeting("Maku...")
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        AmalitechMakuMazakpeAssessmentTheme {
            Greeting("Android")
        }
    }
}
