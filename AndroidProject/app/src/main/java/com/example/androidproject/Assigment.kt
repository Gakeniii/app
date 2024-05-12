package com.example.androidproject

import android.graphics.Paint.Align
import android.graphics.fonts.FontStyle
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidproject.ui.theme.AndroidProjectTheme

class Assigment : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Page1()
                }
            }
        }
    }
}

@Preview
@Composable
fun Preview(){
    Page1()
}


@Composable
fun Page1() {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.cabin),
            contentDescription = "Background Image",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize()
        )

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Spacer(modifier = Modifier.height(20.dp))
            Text(
                textAlign = TextAlign.Center,
                text = "Wanderly",
                color = Color.Green,
                fontWeight = FontWeight.Bold,
                fontSize = 50.sp,
                textDecoration = TextDecoration.Underline
            )
            Text(
                text = "Your Ultimate Companion for Seamless Travel Experiences",
                textAlign = TextAlign.Center,
                color = Color.Green,
                fontSize = 20.sp
            )
            Spacer(modifier = Modifier.height(500.dp))

            Button(
                onClick = { },
                Modifier.fillMaxWidth(),
                contentPadding = PaddingValues(16.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(red = 20, green = 128, blue = 20)
                )
            ) {
                Text(
                    text = "Sign in with your Mobile Number",
                    color = Color.White
                )
            }

            Spacer(modifier = Modifier.height(10.dp))


            Button(
                onClick = { },
                Modifier.fillMaxWidth(),
                contentPadding = PaddingValues(16.dp),
                colors = ButtonDefaults.buttonColors(Color.LightGray)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.applelogo),
                    contentDescription = "logo",
                )
                Text(color = Color.Black,
                    text = "Sign in With Apple", modifier = Modifier.padding(horizontal = 8.dp)

                )
            }
            Spacer(modifier = Modifier.height(10.dp))

                Text(
                    textAlign = TextAlign.Center,
                    text = "Don't have an Account? Sign up",
                    color = Color.White,
                    fontSize = 18.sp
                    )
            Spacer(modifier = Modifier.height(28.dp))

                Text(
                    fontSize = 16.sp,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    text = "By creating an account or signing in, you agree to our")
                Text(text = "Terms of Service",
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    fontSize = 15.sp,)

                Text(text = "and",
                    color = Color.White,
                    fontSize = 15.sp)
                Text(text = "Privacy Policy",
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    fontSize = 15.sp)



        }
    }
}





