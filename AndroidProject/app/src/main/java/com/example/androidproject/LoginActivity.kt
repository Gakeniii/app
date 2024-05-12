package com.example.androidproject

import android.content.Intent
import android.media.Image
import android.media.tv.TvContract.Channels.Logo
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.magnifier
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidproject.ui.theme.AndroidProjectTheme

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                        Column (modifier = Modifier
                            .clip(shape = RoundedCornerShape(30.dp))
                            .border(width = 1.dp, color = Color.DarkGray)
                        ) {
                            TextComponent("WELCOME BACK",25.sp, Color.Black, FontFamily.Serif, FontWeight.Bold, TextAlign.Center)
                            TextComponent("Login here",
                                18.sp,
                                Color.Black,
                                FontFamily.Serif,
                                FontWeight.Bold,
                                TextAlign.Center
                            )
                            ImageComponent()
                            Spacer(modifier = Modifier.height(20.dp))
                            TextFieldComponent("Enter your name")
                            Spacer(modifier = Modifier.height(20.dp))
                            TextFieldComponent("Email address")
                            Spacer(modifier = Modifier.height(20.dp))
                            TextFieldComponent("Location")
                            Spacer(modifier = Modifier.height(20.dp))
                            TextFieldComponent("Password")

                            CheckBoxComponent(value = "I have read and agree with the terms and conditions")

//        CREATING A BUTTON
                            Spacer(modifier = Modifier.height(30.dp))
                            Button(onClick = {
                                val intent = Intent(this@LoginActivity,MainActivity::class.java)
                                startActivity(intent) },
                                Modifier.fillMaxWidth()) {
                                Text(modifier = Modifier.padding(15.dp),
                                    text = "REGISTER NOW")
                            }

                            Spacer(modifier = Modifier.height(15.dp))
                            Button(
                                onClick = {
                                    val intent = Intent(this@LoginActivity, Assigment::class.java)
                                    startActivity(intent)
                                },
                                Modifier.fillMaxWidth(),
                                colors = ButtonDefaults.buttonColors(Color.Magenta)
                            ) {
                                Text(
                                    modifier = Modifier.padding(15.dp),
                                    text = "INDICATORS"
                                )
                            }

//                            BUTTON FOR BOTTOM APP PAGE
                            Spacer(modifier = Modifier.height(15.dp))
                            Button(
                                onClick = {
                                    val intent = Intent(this@LoginActivity, BottomAppActivity::class.java)
                                    startActivity(intent)
                                },
                                Modifier.fillMaxWidth(),
                                colors = ButtonDefaults.buttonColors(Color.LightGray)
                            ) {
                                Text(
                                    modifier = Modifier.padding(15.dp),
                                    text = "BOTTOM APP"
                                )
                            }


                        }

                    }
                }
            }
        }
    }

@Preview
@Composable
fun LoginPreview(){
    Column (modifier = Modifier
        .clip(shape = RoundedCornerShape(30.dp))
        .border(width = 1.dp, color = Color.DarkGray)
    ) {
        TextComponent("WELCOME BACK",
            25.sp,
            Color.Black,
            FontFamily.Serif,
            FontWeight.Bold,
            TextAlign.Center
        )
        TextComponent("Login here",
            18.sp,
            Color.Black,
            FontFamily.Serif,
            FontWeight.Bold,
            TextAlign.Center
        )
        Spacer(modifier = Modifier.height(20.dp))
//        TextFieldComponent("Enter your name")
        ImageComponent()
        Spacer(modifier = Modifier.height(20.dp))
        TextFieldComponent("Email address")
        Spacer(modifier = Modifier.height(20.dp))
//        TextFieldComponent("Location")
        Spacer(modifier = Modifier.height(20.dp))
        TextFieldComponent("Password")

        CheckBoxComponent(value = "I have read and agree with the terms and conditions")

//        CREATING A BUTTON
        Spacer(modifier = Modifier.height(50.dp))
        Button(onClick = { /*TODO*/},
//             HOW TO CREATE COLORS IN BUTTONS
//            colors = ButtonDefaults.buttonColors(Color.Yellow),
            modifier = Modifier.fillMaxWidth()) {
            Text(modifier = Modifier.padding(15.dp),
                text = "REGISTER NOW")
        }
        Spacer(modifier = Modifier.height(50.dp))
        Button(onClick = { /*TODO*/ },
            modifier = Modifier.fillMaxWidth()) {
            Text(modifier = Modifier.padding(15.dp),
                text = "LOGIN")
        }
    }

}
@Composable
fun ImageComponent(){
    Image(painterResource(id = R.drawable.emobilislogo), contentDescription = "Logo image",
        modifier = Modifier
            .wrapContentHeight()
            .fillMaxWidth()
            .height(100.dp))
}




