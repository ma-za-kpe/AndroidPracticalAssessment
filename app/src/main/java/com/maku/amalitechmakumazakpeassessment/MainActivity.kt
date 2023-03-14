package com.maku.amalitechmakumazakpeassessment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateColor
import androidx.compose.animation.core.InfiniteRepeatableSpec
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.ConstraintSet
import androidx.constraintlayout.compose.Dimension
import com.maku.amalitechmakumazakpeassessment.ui.theme.AmalitechMakuMazakpeAssessmentTheme
import kotlin.random.Random
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {

    private var i = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AmalitechMakuMazakpeAssessmentTheme {
//                Greeting("Maku ...")
                // TODO 3: uncomment and move this using navigation button for first video to its own screen
//                Box(
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .padding(6.dp)
//                ) {
//                    ImageCard(
//                        painter = painterResource(
//                            id = R.drawable.ic_launcher_background
//                        ),
//                        contentDescription = "Cool card with image",
//                        title = "This is Maku"
//                    )
//                }
                // TODO 4: uncomment and move this using navigation button for first video to its own screen
//                StyleText()

                // TODO 5: uncomment and move this using navigation button for sixth video to its own screen
//                Column(
//                    modifier = Modifier
//                        .fillMaxSize()
//                ) {
//                    val color = remember {
//                        mutableStateOf(Color(0xFF3771E6))
//                    }
//                    Box(
//                        modifier = Modifier
//                            .fillMaxSize()
//                            .background(
//                                Color(color.value.value)
//                            )
//                            .weight(1f)
//                            .clickable {
//                                color.value = Color(
//                                    Random.nextFloat(),
//                                    Random.nextFloat(),
//                                    Random.nextFloat(),
//                                    1f
//                                )
//                            }
//                    )
//
//                    StateInCompose(
//                        {},
//                        modifier = Modifier
//                            .weight(1f)
//                    )
//                }

                // TODO 6: uncomment and move this using navigation button for seventh video to its own screen
//                TextFieldsInCompose()

                // TODO 7: uncomment and move this using navigation button for eight video to its own screen
//                ListsInCompose()

                // TODO 8: uncomment and move this using navigation button for eight video to its own screen
//                ConstraintLayoutInCompose()

                // TODO 9: uncomment and move this using navigation button for eight video to its own screen
//                EffectHandlersInCompose()

                // TODO 10: uncomment and move this using navigation button for eight video to its own screen
                AnimationsInCompose()
            }
        }
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
            targetValue =  Color.Cyan,
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
                .background(color),
            contentAlignment = Alignment.TopCenter
        ) {

            Box(Modifier.fillMaxSize()) {
                Icon(
                    Icons.Filled.Favorite,
                    contentDescription = null,
                    modifier = Modifier.align(Alignment.Center)
                        .graphicsLayer(
                            scaleX = scale,
                            scaleY = scale
                        ),
                    tint = color
                )
            }
            Button(
                onClick = {
                    sizestate += 50.dp
                }
            ) {
                Text(
                    text = "Increase size"
                )
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun AnimationsInComposePreview() {
        AmalitechMakuMazakpeAssessmentTheme {
            AnimationsInCompose()
        }
    }

    @Composable
    fun EffectHandlersInCompose(
        modifier: Modifier = Modifier
    ) {
        var text by remember {
            mutableStateOf("")
        }
//        Button(
//            onClick = {
//                text += "#"
//            }
//        ) {
//            i++
//            Text(text = text)
//        }

        LaunchedEffect(
            key1 = text
        ) {
            delay(1000L)
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun EffectHandlersInComposePreview() {
        AmalitechMakuMazakpeAssessmentTheme {
            EffectHandlersInCompose()
        }
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
            modifier = modifier
                .fillMaxSize()
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
    fun ConstraintLayoutInComposePreview() {
        AmalitechMakuMazakpeAssessmentTheme {
            ConstraintLayoutInCompose()
        }
    }

    @Composable
    fun ListsInCompose(
        modifier: Modifier = Modifier
    ) {
        LazyColumn(
            modifier = modifier
                .fillMaxSize(),
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
    fun ListsInComposePreview() {
        AmalitechMakuMazakpeAssessmentTheme {
            ListsInCompose()
        }
    }

    @Composable
    fun TextFieldsInCompose(
        modifier: Modifier = Modifier
    ) {
        val state = rememberScaffoldState()
        val coroutineScope = rememberCoroutineScope()
        var textFieldState by remember {
            mutableStateOf("")
        }
        Scaffold(
            modifier = modifier
                .fillMaxSize(),
            scaffoldState = state
        ) { it ->
            Column(
                modifier = modifier
                    .padding(it),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                TextField(
                    value = textFieldState,
                    modifier = modifier
                        .fillMaxWidth()
                        .padding(8.dp),
                    onValueChange = {
                        textFieldState = it
                    },
                    label = {
                        Text(text = "Name")
                    }
                )
            }

            Spacer(
                modifier = modifier.padding(16.dp)
            )

            Button(
                onClick = {
                    coroutineScope.launch {
                        state.snackbarHostState.showSnackbar(
                            "clicking $textFieldState"
                        )
                    }
                }
            ) {
                Text(
                    text = "Click Me"
                )
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun TextFieldsInComposePreview() {
        AmalitechMakuMazakpeAssessmentTheme {
            TextFieldsInCompose()
        }
    }

    @Composable
    fun StateInCompose(
        updateColor: (Color) -> Unit,
        modifier: Modifier = Modifier
    ) {
        Box(
            modifier = modifier
                .fillMaxSize()
                .background(
                    Color.Magenta
                )
                .clickable {
                    updateColor(
                        Color(
                            Random.nextFloat(),
                            Random.nextFloat(),
                            Random.nextFloat(),
                            1f
                        )
                    )
                }
        ) {}
    }

    @Preview(showBackground = true)
    @Composable
    fun StateInComposePreview() {
        AmalitechMakuMazakpeAssessmentTheme {
            StateInCompose({})
        }
    }

    @Composable
    fun StyleText() {
        val fontFamily = FontFamily(
            Font(
                R.font.dosis_bold,
                FontWeight.Bold
            ),
            Font(
                R.font.dosis_extrabold,
                FontWeight.ExtraBold
            ),
            Font(
                R.font.dosis_extralight,
                FontWeight.ExtraLight
            ),
            Font(
                R.font.dosis_light,
                FontWeight.Light
            ),
            Font(
                R.font.dosis_medium,
                FontWeight.Medium
            ),
            Font(
                R.font.dosis_regular,
                FontWeight.Normal
            ),
            Font(
                R.font.dosis_semibold,
                FontWeight.SemiBold
            )
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    Color(0xff101010)
                )
        ) {
            Text(
                text = buildAnnotatedString {
                    withStyle(
                        style = ParagraphStyle(
                            lineHeight = 30.sp
                        )
                    ) {
                        withStyle(
                            style = SpanStyle(
                                color = Color.Blue
                            )
                        ) {
                            append("Maku ")
                        }
                        withStyle(
                            style = SpanStyle(
                                fontWeight = FontWeight.Bold,
                                color = Color.Cyan
                            )
                        ) {
                            append(".....\n")
                        }
                        append("in hello compose")
                    }
                },
                color = Color.White,
                fontSize = 40.sp,
                fontFamily = fontFamily,
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic,
                textAlign = TextAlign.End,
                textDecoration = TextDecoration.Underline
            )
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun StyleTextPreview() {
        AmalitechMakuMazakpeAssessmentTheme {
            StyleText()
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
