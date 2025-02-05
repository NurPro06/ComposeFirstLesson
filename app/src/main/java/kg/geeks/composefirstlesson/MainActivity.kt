package kg.geeks.composefirstlesson

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kg.geeks.composefirstlesson.ui.theme.ComposeFirstLessonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeFirstLessonTheme {
                Scaffold { paddingValue ->
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(paddingValue),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally

                    ) {

                        Text(
                            text = "Hello",
                            fontSize = 32.sp
                        )
                        Button(
                            modifier = Modifier,
                            shape = RoundedCornerShape(0.dp),
                            onClick = {
                                Toast.makeText(
                                    this@MainActivity,
                                    "Button",
                                    Toast.LENGTH_SHORT
                                ).show()

                            }
                        ) {
                            Text(
                                fontSize = 30.sp,
                                text = "Click me"
                            )
                        }
                        Image(
                            modifier = Modifier
                                .size(200.dp, 200.dp),
                            painter = painterResource(id = R.drawable.image),
                            contentDescription = "Image"
                        )
                        Row {
                            Text(
                                text = "Compose",
                                fontSize = 32.sp

                            )
                            Button(
                                onClick = {

                                }
                            ) { }
                        }
                        Text(
                            text = "edeed"
                        )
                    }
                }
            }
                @Composable
                fun MainActivity_Preview() {

                }
            }

        }
    }
